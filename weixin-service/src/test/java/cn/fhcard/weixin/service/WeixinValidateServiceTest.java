package cn.fhcard.weixin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import cn.fhcard.weixin.dto.ValidateBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class WeixinValidateServiceTest
{
    @Autowired
    private WeixinValidateServerService validateService;
    
    @Test
    public void test()
    {
        String signature = "b8a9919684f7f2c895e828e75b230eddc4d5bc55";
        String timestamp = "1457410808";
        String nonce = "802212947";
        String echostr = "6101491049654319099";
        ValidateBean bean = new ValidateBean();
        bean.setSignature(signature);
        bean.setTimestamp(timestamp);
        bean.setNonce(nonce);
        bean.setEchostr(echostr);
        System.out.println(validateService.isValid(bean));
        Assert.isTrue(validateService.isValid(bean));
    }
    
}
