package cn.fhcard.weixin.error;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.codefarm.spring.modules.util.ClassLoaderUtil;

import cn.fhcard.weixin.exception.WeixinServiceException;

public class WeixinErrorRegister
{
    private static final Map<String, WeixinError> errors = new HashMap<String, WeixinError>();
    
    private static final String UNKOWN_CODE = "-99999";
    
    private static final String UNKOWN_MSG = "未知错误";
    
    private static final WeixinError UNKONW = new WeixinError(UNKOWN_CODE, null,
            UNKOWN_MSG);
    {
        errors.put(UNKOWN_CODE, UNKONW);
    }
    
    public void init(String location)
    {
        try
        {
            InputStream stream = ClassLoaderUtil.getResourceAsStream(location);
            Properties props = new Properties();
            props.load(stream);
            Enumeration<Object> keys = props.keys();
            String key;
            while (keys.hasMoreElements())
            {
                key = (String) keys.nextElement();
                errors.put(key,
                        new WeixinError(key, null, props.getProperty(key)));
            }
        }
        catch (IOException e)
        {
            throw new WeixinServiceException(e);
        }
    }
    
    public static WeixinError getErrorByCode(String code)
    {
        WeixinError error = errors.get(code);
        if (error == null)
            return UNKONW;
        return error;
    }
    
}
