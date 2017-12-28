package com.netease.test.Validte;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.validation.beanvalidation.MethodValidationInterceptor;

public class MyValte extends MethodValidationInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return null;
    }
}
