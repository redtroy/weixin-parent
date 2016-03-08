package cn.fhcard.weixin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codefarm.spring.modules.util.JsonMapper;

public class JsonUtil
{
    private static final Logger logger = LoggerFactory
            .getLogger(JsonUtil.class);
    
    public static <T> T fromJson(String json, Class<T> clazz)
    {
        logger.info("原始报文：{}", json);
        return JsonMapper.nonDefaultMapper().fromJson(json, clazz);
    }
}
