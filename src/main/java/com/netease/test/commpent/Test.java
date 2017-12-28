package com.netease.test.commpent;

import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
//@Component
public class Test {
    static final String a="sada";
    static abstract class Student<T>{

        public
        Student() {
            System.out.println(getClass());
            System.out.println(getClass().getSuperclass());
            System.out.println(getClass().getGenericSuperclass());
            System.out.println("____________");

        }
    }
    static class XS extends Student{
        public XS() {
            System.out.println(getClass());
            System.out.println(getClass().getSuperclass());
            System.out.println(getClass().getGenericSuperclass());
        }
    }
        public static void main(String[] args) {
            new XS();
        }
}
