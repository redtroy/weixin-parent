package cn.fhcard.weixin.controller;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.fhcard.weixin.dto.OAuthAccessToken;
import cn.fhcard.weixin.dto.OAuthResponse;
import cn.fhcard.weixin.dto.UserBean;
import cn.fhcard.weixin.service.WeixinOAuthService;
import cn.fhcard.weixin.service.WeixinUserService;

@Controller
@RequestMapping(value = "/oauth")
public class WeixinOAuthController
{
    private static final Logger logger = org.slf4j.LoggerFactory
            .getLogger(WeixinOAuthController.class);
    
    @Autowired
    private WeixinOAuthService oauthService;
    
    @Autowired
    private WeixinUserService userService;
    
    @Value("${login-view}")
    private String login;
    
    @RequestMapping("callback.html")
    public String callback(OAuthResponse response)
    {
        logger.info("接收微信网页授权回调:{}", response);
        OAuthAccessToken oAuthToken = oauthService
                .getOAuthToken(response.getCode());
        UserBean user = userService.getUser(oAuthToken.getOpenId());
        SecurityUtils.getSubject().getSession(true).setAttribute("oauthUser",
                user);
        return login;
    }
}
