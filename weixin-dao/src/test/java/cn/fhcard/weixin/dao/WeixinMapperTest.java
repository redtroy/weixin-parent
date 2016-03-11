package cn.fhcard.weixin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.fhcard.weixin.dao.entity.WeixinUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class WeixinMapperTest
{
    @Autowired(required = true)
    private WeixinUserMapper mapper;
    
    @Test
    @Transactional
    public void testAddWeixinUser()
    {
        WeixinUser user = new WeixinUser();
        user.setNickName("redtroy");
        mapper.addWeixinUser(user);
    }
}
