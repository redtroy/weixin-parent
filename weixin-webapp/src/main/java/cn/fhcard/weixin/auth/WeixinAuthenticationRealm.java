package cn.fhcard.weixin.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.AuthenticatingRealm;

public class WeixinAuthenticationRealm extends AuthenticatingRealm
{
    
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken arg0) throws AuthenticationException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
