package cn.fhcard.weixin.dao.typehandler;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import cn.fhcard.weixin.enums.Sex;

public class SexEnumTypeHandler extends EnumOrdinalTypeHandler<Sex>
{
    
    public SexEnumTypeHandler(Class<Sex> type)
    {
        super(type);
    }
    
}
