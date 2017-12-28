package com.netease.test.model.vo.response;

import java.io.Serializable;

/**
 * 续费状态检查响应
 *
 * @author xiacongling on 2017/4/27.
 */
public class RenewCheckVO implements Serializable {

    /**
     * 完整的 URS 帐号
     */
    private String ssn;

    /**
     * 续费后靓号的到期时间
     */
    private Long expireTime;

    public RenewCheckVO() {
    }

    public RenewCheckVO(String ssn, Long expireTime) {
        this.ssn = ssn;
        this.expireTime = expireTime;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }
}
