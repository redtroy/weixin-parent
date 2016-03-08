package cn.fhcard.weixin.exception;

import cn.fhcard.weixin.error.WeixinError;

public class WeixinServiceException extends RuntimeException
{
    private WeixinError error;
    
    public WeixinServiceException(WeixinError error)
    {
        super();
        this.error = error;
    }
    
    public WeixinServiceException(WeixinError error, String message)
    {
        super(message);
        this.error = error;
    }
    
    public WeixinServiceException()
    {
        super();
    }
    
    public WeixinServiceException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public WeixinServiceException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    public WeixinServiceException(String message)
    {
        super(message);
    }
    
    public WeixinServiceException(Throwable cause)
    {
        super(cause);
    }
    
    public WeixinError getError()
    {
        return error;
    }
    
    public void setError(WeixinError error)
    {
        this.error = error;
    }
    
}
