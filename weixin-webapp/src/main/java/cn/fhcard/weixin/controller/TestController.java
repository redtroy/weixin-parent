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
    
    @Value("${home-view}")
    private String home;
    
    @Value("${member-view}")
    private String member;
    
    @Value("${recharge-view}")
    private String recharge;
    
    @RequestMapping("index.html")
    public String index()
    {
        return login;
    }
    
    @RequestMapping("home.html")
    public String home()
    {
        return home;
    }
    
    @RequestMapping("recharge.html")
    public String recharge()
    {
        return recharge;
    }
    
    @RequestMapping("member.html")
    public String member()
    {
        return member;
    }
}
