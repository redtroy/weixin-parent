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
    private WeixinValidateService validateService;
    
    @Test
    public void test()
    {
        String signature = "5a6452383fbbad6bb1dad7bc2878d725ce63c544";
        String timestamp = "1457064619";
        String nonce = "953725108";
        String echostr = "5460338271577521919";
        ValidateBean bean = new ValidateBean();
        bean.setSignature(signature);
        bean.setTimestamp(timestamp);
        bean.setNonce(nonce);
        bean.setEchostr(echostr);
        Assert.isTrue(validateService.isValid(bean));
    }
    
}
