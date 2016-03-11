package cn.fhcard.weixin.dao.typehandler;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import cn.fhcard.weixin.enums.Subscribe;

public class SubscribeEnumTypeHandler extends EnumOrdinalTypeHandler<Subscribe>
{
    
    public SubscribeEnumTypeHandler(Class<Subscribe> type)
    {
        super(type);
    }
    
}
