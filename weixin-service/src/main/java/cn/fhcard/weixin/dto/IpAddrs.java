package cn.fhcard.weixin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IpAddrs
{
    @JsonProperty(value = "ip_list")
    private String[] ipList;
    
    public String[] getIpList()
    {
        return ipList;
    }
    
    public void setIpList(String[] ipList)
    {
        this.ipList = ipList;
    }
}
