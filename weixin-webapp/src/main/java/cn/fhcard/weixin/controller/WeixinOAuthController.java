package cn.fhcard.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.fhcard.weixin.dto.OAuthAccessToken;
import cn.fhcard.weixin.dto.OAuthResponse;
import cn.fhcard.weixin.dto.UserBean;
import cn.fhcard.weixin.service.WeixinOAuthService;
import cn.fhcard.weixin.service.WeixinUserService;

@Controller
@RequestMapping(value = "/oauth")
public class WeixinOAuthController
{
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinOAuthController.class);
    
    @Autowired
    private WeixinOAuthService oauthService;
    
    @Autowired
    private WeixinUserService userService;
    
    @RequestMapping("callback")
    @ResponseBody
    public String callback(OAuthResponse response)
    {
        logger.info("接收微信网页授权回调:{}", response);
        OAuthAccessToken oAuthToken = oauthService
                .getOAuthToken(response.getCode());
        UserBean user = userService.getUser(oAuthToken.getOpenId());
        return user.toString();
    }
}
