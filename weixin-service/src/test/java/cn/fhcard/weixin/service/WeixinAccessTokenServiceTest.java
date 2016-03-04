package cn.fhcard.weixin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WeixinAccessTokenServiceTest extends TestBase
{
    @Autowired
    private WeixinAccessTokenService service;
    
    @Test
    public void testGetToken()
    {
        String token = service.getToken();
        System.out.println(token.toString());
    }
    
}
