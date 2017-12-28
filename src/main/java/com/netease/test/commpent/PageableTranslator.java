package com.netease.test.commpent;

import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.autoproxy.AbstractBeanFactoryAwareAdvisingPostProcessor;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by hzjiaoguangcai on 2017/8/1.
 */
@Component
public class PageableTranslator extends AbstractBeanFactoryAwareAdvisingPostProcessor implements InitializingBean {


    public void afterPropertiesSet() throws Exception {
        Collection proxy=(Collection)Proxy.newProxyInstance(
                Collection.class.getClassLoader(),
                new Class[]{Collection.class},
                new InvocationHandler(){
                    ArrayList target=new ArrayList();
                    @Override
                    public Object invoke(Object proxy, Method method,
                                         Object[] args) throws Throwable {
                        // TODO Auto-generated method stub
                        Object obj=method.invoke(target, args);
                        return obj;
                    }

                }
        );
        Pointcut pointcut = new AnnotationMatchingPointcut(null, Permission.class);
        this.advisor = new DefaultPointcutAdvisor(pointcut, new PermissionInterceptor());
    };
}
