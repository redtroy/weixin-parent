package cn.fhcard.weixin.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.fhcard.weixin.HttpUtil;
import cn.fhcard.weixin.exception.WeixinServiceException;
import cn.fhcard.weixin.service.WeixinBasicService;

@Aspect
@Component
public class WeixinControllerInterceptor
{
    
    private static final Logger logger = LoggerFactory
            .getLogger(WeixinControllerInterceptor.class);
    
    @Autowired
    private WeixinBasicService basicService;
    
    @Value("${enable-controller-advice}")
    private boolean enabled;
    
    // @Pointcut("@annotation(cn.fhcard.weixin.controller.interceptor.EnableCheckIP)")
    @Pointcut("execution(* cn.fhcard.weixin.controller.*.*(..))")
    public void beforeController()
    {
        
    }
    
    @Before("beforeController()")
    public void doBefore()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        String ip = HttpUtil.getIpAddr(request);
        String[] ipList = basicService.getIpList();
        if (!checkIpList(ip, ipList))
            throw new WeixinServiceException("IP校验失败：" + ip);
    }
    
    /**
     * 检查来源IP是否在微信IP列表中
     * @param ip
     * @param ipList
     * @return
     */
    private boolean checkIpList(String ip, String[] ipList)
    {
        Assert.hasText(ip, "来源IP不能为空!");
        if (!enabled)
            return true;
        logger.info("校验来源IP是否合法:{}", ip);
        if (ipList == null || ipList.length == 0)
            return true;
        for (String i : ipList)
        {
            if (ip.equals(i))
                return true;
        }
        return false;
    }
}
