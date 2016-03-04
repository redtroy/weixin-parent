package cn.fhcard.weixin.service;

import java.util.Arrays;

import com.codefarm.spring.modules.util.Digests;

import cn.fhcard.weixin.dto.ValidateBean;

public class WeixinValidateService
{
    private String token;
    
    public boolean isValid(ValidateBean bean)
    {
        String[] arr = { token, bean.getNonce(), bean.getTimestamp() };
        Arrays.sort(arr);
        StringBuilder builder = new StringBuilder();
        String string = builder.append(arr[0])
                .append(arr[1])
                .append(arr[3])
                .toString();
        byte[] sha1 = Digests.sha1(string.getBytes());
        return sha1.equals(bean.getSignature());
    }
}
