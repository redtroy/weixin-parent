package cn.fhcard.weixin.service;

/**
 * @author zhangjian
 *
 */
public class SystemConstraints
{
    private static String appId;
    
    private static String appSecret;
    
    public static final String WEIXIN_CACHE_NAME = "weixin-cache";
    
    public static final String WEIXIN_ACCESS_TOKEN_KEY = "access_token";
    
    public static String getAppId()
    {
        return appId;
    }
    
    public static void setAppId(String appId)
    {
        SystemConstraints.appId = appId;
    }
    
    public static String getAppSecret()
    {
        return appSecret;
    }
    
    public static void setAppSecret(String appSecret)
    {
        SystemConstraints.appSecret = appSecret;
    }
}
