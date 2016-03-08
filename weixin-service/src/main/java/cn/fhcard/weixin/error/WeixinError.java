package cn.fhcard.weixin.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeixinError
{
    
    @JsonProperty(value = "errcode")
    private String errCode;
    
    @JsonProperty(value = "errmsg")
    private String errMsg;
    
    private String translation;
    
    public WeixinError()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public WeixinError(String errCode, String errMsg, String translation)
    {
        super();
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.translation = translation;
    }
    
    public String getErrCode()
    {
        return errCode;
    }
    
    public void setErrCode(String errCode)
    {
        this.errCode = errCode;
    }
    
    public String getErrMsg()
    {
        return errMsg;
    }
    
    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }
    
    public String getTranslation()
    {
        return translation;
    }
    
    public void setTranslation(String translation)
    {
        this.translation = translation;
    }
    
    @Override
    public String toString()
    {
        return "WeixinError [errCode=" + errCode + ", errMsg=" + errMsg
                + ", translation=" + translation + "]";
    }
}
