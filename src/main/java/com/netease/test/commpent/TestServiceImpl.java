package com.netease.test.commpent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hzjiaoguangcai on 2017/8/7.
 */
public class TestServiceImpl implements TestService,InitializingBean {
    private int a;
    private boolean old;

    public boolean isOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public TestServiceImpl() {
        System.out.println();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("set()");
        this.a = a;
    }

    public void say() {
        System.out.println("say");
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }
}
