package cn.fhcard.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.fhcard.weixin.dto.ValidateBean;
import cn.fhcard.weixin.service.WeixinValidateService;

@Controller
@RequestMapping("/validate")
public class WeixinValidateController
{
    private static final String FAIL = "";
    
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinValidateController.class);
    
    @Autowired
    private WeixinValidateService validateService;
    
    @RequestMapping("echo")
    @ResponseBody
    public String echo(ValidateBean bean)
    {
        logger.info("接收到微信服务器验证请求：{}", bean.toString());
        try
        {
            if (validateService.isValid(bean))
                return bean.getEchostr();
        }
        catch (Exception e)
        {
            logger.error("微信服务器验证失败：", e);
        }
        return FAIL;
    }
    
}
