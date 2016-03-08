package cn.fhcard.weixin;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil
{
    public static String getIpAddr(HttpServletRequest request)
    {
        String strUserIp = null;
        /** * */
        // Apache 代理 解决IP地址问题
        strUserIp = request.getHeader("X-Forwarded-For");
        if (strUserIp == null || strUserIp.length() == 0
                || "unknown".equalsIgnoreCase(strUserIp))
        {
            strUserIp = request.getHeader("Proxy-Client-IP");
        }
        if (strUserIp == null || strUserIp.length() == 0
                || "unknown".equalsIgnoreCase(strUserIp))
        {
            strUserIp = request.getHeader("WL-Proxy-Client-IP");
        }
        if (strUserIp == null || strUserIp.length() == 0
                || "unknown".equalsIgnoreCase(strUserIp))
        {
            strUserIp = request.getRemoteAddr();
        }
        // 解决获取多网卡的IP地址问题
        if (strUserIp != null)
        {
            strUserIp = strUserIp.split(",")[0];
        }
        else
        {
            strUserIp = "127.0.0.1";
        }
        // 解决获取IPv6地址 暂时改为本机地址模式
        if (strUserIp.length() > 16)
        {
            strUserIp = "127.0.0.1";
        }
        return strUserIp;
        // 没有IP Apache 代理 解决IP地址问题
        // strUserIp=request.getRemoteAddr();
        // if (strUserIp != null) {strUserIp = strUserIp.split(",")[0];}
        // return strUserIp;
    }
}
