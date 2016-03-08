package cn.fhcard.weixin.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.codefarm.spring.modules.beanfactory.CustomizedPropertyPlaceholderConfigurer;

import cn.fhcard.weixin.error.WeixinErrorRegister;

/**
 * @author zhangjian
 *
 */
public class SystemLoader implements BeanFactoryPostProcessor
{
    private String errFileLocation;
    
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory)
            throws BeansException
    {
        //初始化系统参数
        CustomizedPropertyPlaceholderConfigurer holder = factory
                .getBean(CustomizedPropertyPlaceholderConfigurer.class);
        SystemConstraints.setAppId(holder.getContextProperty("appid"));
        SystemConstraints.setAppSecret(holder.getContextProperty("appsecret"));
        //初始化错误表
        new WeixinErrorRegister().init(errFileLocation);
        
    }
    
    public String getErrFileLocation()
    {
        return errFileLocation;
    }
    
    public void setErrFileLocation(String errFileLocation)
    {
        this.errFileLocation = errFileLocation;
    }
    
}
