package cn.fhcard.weixin.dao;

import org.springframework.stereotype.Component;

import com.codefarm.mybatis.orm.annotations.Insert;

import cn.fhcard.weixin.dao.entity.WeixinUser;

@Component
public interface WeixinUserMapper
{
    @Insert
    public int addWeixinUser(WeixinUser user);
}
