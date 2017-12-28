package com.netease.test.model.log;

//import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public class BaseLog implements Serializable{
    private static final long serialVersionUID = 6807427596022758108L;
    /**
     * 请求的时间戳,ms
     */
    private long timestamp;

    /**
     * 操作类型
     */

    public BaseLog() {
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String toJson() {
        return toString();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
