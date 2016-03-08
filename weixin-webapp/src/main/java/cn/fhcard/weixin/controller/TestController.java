package cn.fhcard.weixin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController
{
    @Value("${login-view}")
    private String login;
    
    @RequestMapping("index.html")
    public String index()
    {
        return login;
    }
}
