package cn.fhcard.weixin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.fhcard.weixin.enums.OAuthScope;

public class OAuthAccessToken
{
    @JsonProperty(value = "access_token")
    private String accessToken;
    
    @JsonProperty(value = "expires_in")
    private Integer expiresIn;
    
    @JsonProperty(value = "refresh_token")
    private String refreshToken;
    
    @JsonProperty(value = "openid")
    private String openId;
    
    @JsonProperty(value = "scope")
    private OAuthScope scope;
    
    public String getAccessToken()
    {
        return accessToken;
    }
    
    public void setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;
    }
    
    public Integer getExpiresIn()
    {
        return expiresIn;
    }
    
    public void setExpiresIn(Integer expiresIn)
    {
        this.expiresIn = expiresIn;
    }
    
    public String getRefreshToken()
    {
        return refreshToken;
    }
    
    public void setRefreshToken(String refreshToken)
    {
        this.refreshToken = refreshToken;
    }
    
    public String getOpenId()
    {
        return openId;
    }
    
    public void setOpenId(String openId)
    {
        this.openId = openId;
    }
    
    public OAuthScope getScope()
    {
        return scope;
    }
    
    public void setScope(OAuthScope scope)
    {
        this.scope = scope;
    }
    
    @Override
    public String toString()
    {
        return "OAuthAccessToken [accessToken=" + accessToken + ", expiresIn="
                + expiresIn + ", refreshToken=" + refreshToken + ", openId="
                + openId + ", scope=" + scope + "]";
    }
}
