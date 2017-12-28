package com.netease.test.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {
    @Bean
    public MyInterceptor myInterceptor() {
        return new MyInterceptor();
    }
    @Bean
    public MyInterceptor2 myInterceptor2() {
        return new MyInterceptor2();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(myInterceptor2());
        registry.addInterceptor(myInterceptor()).addPathPatterns("/test/**");
    }
}
