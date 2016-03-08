package cn.fhcard.weixin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WeixinBasicServiceTest extends TestBase
{
    @Autowired
    private WeixinBasicService service;
    
    public void testGetToken()
    {
        String token = service.getAccessToken();
        System.out.println(token.toString());
    }
    
    @Test
    public void testGetIpList()
    {
        String[] ipList = service.getIpList();
        System.out.println(ipList.length);
    }
}
