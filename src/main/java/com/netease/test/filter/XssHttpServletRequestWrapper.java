package com.netease.test.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * <pre>
 * Created by hzwangxx on 17/5/11.
 * </pre>
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {
    public XssHttpServletRequestWrapper(HttpServletRequest servletRequest) {
        super(servletRequest);
    }

    @Override
    public String[] getParameterValues(String parameter) {
        String[] values = super.getParameterValues(parameter);

        return values;
    }

    @Override
    public String getParameter(String parameter) {
        String value = super.getParameter(parameter);
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override
    public String getHeader(String name) {
        String value = super.getHeader(name);
        if (value == null)
            return null;
        return value;
    }

    private String cleanXSS(String value) {
        //You'll need to remove the spaces from the html entities below
        return value
                .replaceAll("<", "& lt;")
                .replaceAll(">", "& gt;")
                .replaceAll("\\(", "& #40;")
                .replaceAll("\\)", "& #41;")
                .replaceAll("'", "& #39;")
                .replaceAll("eval\\((.*)\\)", "")
                .replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"")
                .replaceAll("script", "");
    }
}
