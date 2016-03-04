package cn.fhcard.weixin.service;

import org.junit.Test;

import com.codefarm.spring.modules.util.JsonMapper;
import com.codefarm.spring.modules.util.serializer.JsonSerializer;

import cn.fhcard.weixin.dto.AccessToken;

public class JsonMapperTest
{
    
    @Test
    public void test()
    {
        AccessToken token = new AccessToken();
        token.setAccessToken("abc");
        token.setExpiresIn(7200);
        String result = new JsonSerializer().serialize(token);
        System.out.println(result);
        result = JsonMapper.nonDefaultMapper().toJson(token);
        AccessToken fromJson = JsonMapper.nonDefaultMapper().fromJson(result,
                AccessToken.class);
        System.out.println(result);
        System.out.println(fromJson.getExpiresIn());
    }
    
}
