package cn.fhcard.weixin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessToken
{
    @JsonProperty(value = "access_token")
    private String accessToken;
    
    @JsonProperty(value = "expires_in")
    private Integer expiresIn;
    
    public String getAccessToken()
    {
        return accessToken;
    }
    
    public void setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;
    }
    
    @Override
    public String toString()
    {
        return "AccessToken [accessToken=" + accessToken + ", expiresIn="
                + expiresIn + "]";
    }
    
    public Integer getExpiresIn()
    {
        return expiresIn;
    }
    
    public void setExpiresIn(Integer expiresIn)
    {
        this.expiresIn = expiresIn;
    }
}
