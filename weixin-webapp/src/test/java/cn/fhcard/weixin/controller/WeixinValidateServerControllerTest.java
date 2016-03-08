package cn.fhcard.weixin.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.fhcard.weixin.dto.ValidateBean;

public class WeixinValidateServerControllerTest extends TestBase
{
    @Autowired
    private WeixinValidateServerController controller;
    
    @Test
    public void testEcho()
    {
        controller.echo(new ValidateBean());
    }
}
