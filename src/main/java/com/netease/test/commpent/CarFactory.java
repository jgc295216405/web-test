package com.netease.test.commpent;

import com.netease.test.model.HaomaPO;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CarFactory implements FactoryBean<HaomaPO>,BeanPostProcessor {
    @Override
    public HaomaPO getObject() throws Exception {
        return new HaomaPO();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
       @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)  {
        System.out.println("postProcessBeforeInitialization()");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("postProcessAfterInitialization()");
        return bean;
    }
}
