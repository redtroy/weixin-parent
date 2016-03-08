package cn.fhcard.weixin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error
{
    @JsonProperty(value = "errcode")
    private String errCode;
    
    @JsonProperty(value = "errmsg")
    private String errMsg;
    
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
}
