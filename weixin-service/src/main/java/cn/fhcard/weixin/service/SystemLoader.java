package cn.fhcard.weixin.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.codefarm.spring.modules.beanfactory.CustomizedPropertyPlaceholderConfigurer;

public class SystemLoader implements BeanFactoryPostProcessor
{
    
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory)
            throws BeansException
    {
        CustomizedPropertyPlaceholderConfigurer holder = factory
                .getBean(CustomizedPropertyPlaceholderConfigurer.class);
        SystemConstraints.setAppId(holder.getContextProperty("appid"));
        SystemConstraints.setAppSecret(holder.getContextProperty("appsecret"));
    }
    
}
