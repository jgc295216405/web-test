package com.netease.test.commpent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ProxyAwareBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext context;

    public ProxyAwareBeanPostProcessor() {
        System.out.println();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"aaa");
        return bean;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//
//        if (bean instanceof ProxyAware) {
//            ((ProxyAware) bean).setProxy(context.getBean(beanName));
//        }

        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
