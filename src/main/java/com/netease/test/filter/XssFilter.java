package com.netease.test.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <pre>
 * Created by hzwangxx on 17/5/11.
 * </pre>
 */
public class XssFilter implements Filter {
    private FilterConfig filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        this.filterConfig = null;
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
//        XssHttpServletResponseWrapper xssHttpServletResponseWrapper=new XssHttpServletResponseWrapper((HttpServletResponse) response);
        chain.doFilter(request,response);
//        String s=xssHttpServletResponseWrapper.getResult();
//        response.getOutputStream().write("1111111".getBytes());

//out.flush();
//out.close();
    }
}
