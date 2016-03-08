package cn.fhcard.weixin.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.codefarm.spring.modules.util.HttpClient;
import com.codefarm.spring.modules.util.MessageFormatter;

import cn.fhcard.weixin.JsonUtil;
import cn.fhcard.weixin.dto.UserBean;
import cn.fhcard.weixin.exception.WeixinServiceException;

@Service
public class WeixinUserService
{
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinUserService.class);
    
    @Value("${get-user-url}")
    private String getUserUrl;
    
    @Autowired
    private WeixinBasicService basicService;
    
    HttpClient http = new HttpClient();
    
    public UserBean getUser(String openId) throws WeixinServiceException
    {
        String accessToken = basicService.getAccessToken();
        String response = null;
        String url = MessageFormatter.arrayFormat(getUserUrl,
                accessToken,
                openId);
        
        try
        {
            logger.info("通过OpenID获取用户信息：{}", url);
            response = http.get(url);
            return JsonUtil.fromJson(response, UserBean.class);
        }
        catch (ClientProtocolException e)
        {
            logger.error("通过OpenID获取用户信息失败：{}", e);
            throw new WeixinServiceException(e);
        }
        catch (IOException e)
        {
            logger.error("通过OpenID获取用户信息失败：{}", e);
            throw new WeixinServiceException(e);
        }
    }
}
