package com.netease.test.commpent;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by hzjiaoguangcai on 2017/8/1.
 */
public class PermissionInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("aaaaaa");
//        methodInvocation.proceed();
        return null;
    }
}
