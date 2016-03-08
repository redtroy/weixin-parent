package cn.fhcard.weixin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codefarm.spring.modules.util.JsonMapper;
import com.codefarm.spring.modules.util.StringUtils;

import cn.fhcard.weixin.error.WeixinError;
import cn.fhcard.weixin.error.WeixinErrorRegister;
import cn.fhcard.weixin.exception.WeixinServiceException;

public class JsonUtil
{
    private static final Logger logger = LoggerFactory
            .getLogger(JsonUtil.class);
    
    public static <T> T fromJson(String json, Class<T> clazz)
    {
        if (json.indexOf("errcode") > 0)
        {
            WeixinError error = JsonMapper.nonDefaultMapper().fromJson(json,
                    WeixinError.class);
            WeixinError registed = WeixinErrorRegister
                    .getErrorByCode(error.getErrCode());
            if (StringUtils.isEmpty(registed.getErrMsg()))
                registed.setErrMsg(error.getErrMsg());
            throw new WeixinServiceException(registed);
        }
        logger.info("原始报文：{}", json);
        return JsonMapper.nonDefaultMapper().fromJson(json, clazz);
    }
}
