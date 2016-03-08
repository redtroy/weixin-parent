package cn.fhcard.weixin.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.codefarm.spring.modules.util.HttpClient;
import com.codefarm.spring.modules.util.MessageFormatter;

import cn.fhcard.weixin.JsonUtil;
import cn.fhcard.weixin.dto.OAuthAccessToken;
import cn.fhcard.weixin.dto.UserBean;

@Service
public class WeixinOAuthService
{
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinOAuthService.class);
    
    @Value("${oauth-token-url}")
    private String oauthTokenUrl;
    
    @Value("${oauth-get-user-url}")
    private String oauthUseUrl;
    
    private HttpClient http = new HttpClient();
    
    public OAuthAccessToken getOAuthToken(String code)
    {
        
        String url = MessageFormatter.arrayFormat(oauthTokenUrl,
                SystemConstraints.getAppId(),
                SystemConstraints.getAppSecret(),
                code);
        logger.info("获取微信OAuth AccessToken:{}", url);
        String response = null;
        try
        {
            response = http.get(url);
            logger.info("返回报文：{}", response);
            OAuthAccessToken token = JsonUtil.fromJson(response,
                    OAuthAccessToken.class);
            return token;
        }
        catch (ClientProtocolException e)
        {
            logger.error("获取微信OAuth AccessToken失败,错误码：{}\n{}", response, e);
        }
        catch (IOException e)
        {
            logger.error("获取微信OAuth AccessToken失败,错误码：{}\n{}", response, e);
        }
        return null;
    }
    
    public UserBean getOAuthUser(OAuthAccessToken accessToken)
    {
        logger.info("获取OAuth用户信息:{}", accessToken.toString());
        String url = MessageFormatter.arrayFormat(oauthUseUrl,
                accessToken.getAccessToken(),
                accessToken.getOpenId());
        String response = null;
        try
        {
            response = http.get(url);
            logger.info("返回报文：{}", response);
            return JsonUtil.fromJson(response, UserBean.class);
        }
        catch (ClientProtocolException e)
        {
            logger.error("获取OAuth用户失败,错误码：{}\n{}", response, e);
        }
        catch (IOException e)
        {
            logger.error("获取OAuth用户失败,错误码：{}\n{}", response, e);
        }
        return null;
    }
}
