package cn.fhcard.weixin.controller;

import org.junit.Test;

import cn.fhcard.weixin.JsonUtil;
import cn.fhcard.weixin.dto.UserBean;
import cn.fhcard.weixin.exception.WeixinServiceException;

public class JsonUtilTest extends TestBase
{
    
    @Test
    public void testFromJson()
    {
        String response = "{\"errcode\":40013,\"errmsg\":\"invalid appid\"}";
        try
        {
            UserBean user = JsonUtil.fromJson(response, UserBean.class);
            System.out.println(user.toString());
        }
        catch (WeixinServiceException wse)
        {
            System.out.println(wse.getError().toString());
        }
    }
    
}
