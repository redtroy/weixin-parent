package cn.fhcard.weixin.dao.typehandler;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import cn.fhcard.weixin.enums.OAuthScope;

public class OAuthScropEnumTypeHandler
        extends EnumOrdinalTypeHandler<OAuthScope>
{
    
    public OAuthScropEnumTypeHandler(Class<OAuthScope> type)
    {
        super(type);
    }
    
}
