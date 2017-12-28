package com.netease.test.commpent;

import com.netease.test.model.HaomaPO;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class Car2Factory implements Car, FactoryBean<HaomaPO>{
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
}
