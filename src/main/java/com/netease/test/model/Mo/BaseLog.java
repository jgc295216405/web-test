package com.netease.test.model.Mo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public class BaseLog implements Serializable{
    private static final long serialVersionUID = -7446201166826927241L;
    /**
     * 客户的ip
     */
    private String host;
    /**
     * 请求时间
     */
    private long time;
    /**
     * 操作类型
     */
    private LogTypeEnum logTypeEnum;

    public BaseLog(LogTypeEnum logTypeEnum) {
        this.logTypeEnum = logTypeEnum;
        this.time = System.currentTimeMillis();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public LogTypeEnum getLogTypeEnum() {
        return logTypeEnum;
    }

    public void setLogTypeEnum(LogTypeEnum logTypeEnum) {
        this.logTypeEnum = logTypeEnum;
    }

    public String toJson() {
        return toString();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
