package cn.fhcard.weixin.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.codefarm.spring.modules.util.Digests;
import com.codefarm.spring.modules.util.Encodes;

import cn.fhcard.weixin.dto.ValidateBean;

/**
 * @author zhangjian
 *
 */
@Service
public class WeixinValidateServerService
{
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinValidateServerService.class);
    
    @Value("${token}")
    private String token;
    
    public boolean isValid(ValidateBean bean)
    {
        logger.info("处理微信验证服务器：{}", bean.toString());
        Assert.hasText(bean.getEchostr(), "EchoStr can't be empty");
        Assert.hasText(bean.getNonce(), "Nonce can't be empty");
        Assert.hasText(bean.getSignature(), "Signature can't be empty");
        Assert.hasText(bean.getTimestamp(), "Timestamp can't be empty");
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
