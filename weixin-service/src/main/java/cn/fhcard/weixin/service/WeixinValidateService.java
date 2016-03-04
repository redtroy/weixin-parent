package cn.fhcard.weixin.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.codefarm.spring.modules.util.Digests;
import com.codefarm.spring.modules.util.Encodes;

import cn.fhcard.weixin.dto.ValidateBean;

@Service

public class WeixinValidateService
{
    @Value("${token}")
    private String token;
    
    public boolean isValid(ValidateBean bean)
    {
        String[] arr = { token, bean.getNonce(), bean.getTimestamp() };
        Arrays.sort(arr);
        StringBuilder builder = new StringBuilder();
        String string = builder.append(arr[0])
                .append(arr[1])
                .append(arr[2])
                .toString();
        String sha1 = Encodes.encodeHex(Digests.sha1(string.getBytes()));
        return sha1.equals(bean.getSignature());
    }
}
