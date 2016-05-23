package com.springtest.framework.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author  <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/23 11:20.
 * @version Ver 1.0
 */
@Component
@Aspect
public class ServiceAspect implements InitializingBean{
    private final static Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

    @Pointcut(value = "execution(* com.springtest.framework.service.impl..*(..))")
    public void recordLog(){}

    /*
	 * 配置前置通知,使用在方法aspect()上注册的切入点
	 * 同时接受JoinPoint切入点对象,可以没有该参数
	 */
    @Before("recordLog()")
    public void before(JoinPoint joinPoint){
        logger.info("this is before 通知");
    }

    //配置后置通知,使用在方法aspect()上注册的切入点
    @After("recordLog()")
    public void after(JoinPoint joinPoint){
        logger.info("this is after 通知");
    }

    //配置环绕通知,使用在方法aspect()上注册的切入点
    @Around("recordLog()")
    public Object around(ProceedingJoinPoint pjp){
        Object object = null;
        long start = System.currentTimeMillis();
        logger.info("环绕通知");
        try {
            object = pjp.proceed();
            long end = System.currentTimeMillis();
            logger.info("around " + pjp + "\tUse time : " + (end - start) + " ms!");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();
            logger.info("around " + pjp + "\tUse time : " + (end - start) + " ms with exception : " + e.getMessage());
        }
        return  object;
    }

    //配置后置返回通知,使用在方法aspect()上注册的切入点
    @AfterReturning("recordLog()")
    public void afterReturn(JoinPoint joinPoint){
        logger.info("afterReturn " + joinPoint);
    }

    //配置抛出异常后通知,使用在方法aspect()上注册的切入点
    @AfterThrowing(pointcut="recordLog()", throwing="throwable")
    public void afterThrow(JoinPoint joinPoint,Throwable throwable){
        logger.info("afterThrow " + joinPoint + "\t" + throwable.getMessage());
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("init this class" + this.getClass().getName());
    }
}
