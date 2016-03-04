package cn.fhcard.weixin.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.codefarm.cache.manager.CacheLevel;
import com.codefarm.cache.manager.HierarchicalCacheManager;
import com.codefarm.spring.modules.util.HttpClient;
import com.codefarm.spring.modules.util.JsonMapper;
import com.codefarm.spring.modules.util.MessageFormatter;
import com.codefarm.spring.modules.util.StringUtils;

import cn.fhcard.weixin.dto.AccessToken;

/**
 * @author zhangjian
 *
 */
@Service
public class WeixinAccessTokenService
{
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinAccessTokenService.class);
    
    @Value("${access-token-url}")
    private String accessTokenUrl;
    
    private HttpClient http = new HttpClient();
    
    public String getToken()
    {
        String url = MessageFormatter.arrayFormat(accessTokenUrl,
                SystemConstraints.getAppId(),
                SystemConstraints.getAppSecret());
        try
        {
            
            String accessToken = (String) HierarchicalCacheManager.get(
                    CacheLevel.REDIS,
                    SystemConstraints.WEIXIN_CACHE_NAME,
                    SystemConstraints.WEIXIN_ACCESS_TOKEN_KEY);
            
            if (StringUtils.isNotEmpty(accessToken))
            {
                logger.info("从redis获取微信AccessToken：{}", accessToken);
                return accessToken;
            }
            logger.info("访问远程地址：{}", url);
            String result = http.get(url);
            AccessToken token = JsonMapper.nonEmptyMapper().fromJson(result,
                    AccessToken.class);
            HierarchicalCacheManager.set(CacheLevel.REDIS,
                    SystemConstraints.WEIXIN_CACHE_NAME,
                    SystemConstraints.WEIXIN_ACCESS_TOKEN_KEY,
                    token.getAccessToken(),
                    token.getExpiresIn());
            logger.info("从远程获取微信AccessToken：{}，于{}秒后失效",
                    token.getAccessToken(),
                    token.getExpiresIn());
            return token.getAccessToken();
        }
        
        catch (IOException e)
        {
            logger.error("获取微信AccessToken失败：{}", e);
        }
        return null;
    }
}
