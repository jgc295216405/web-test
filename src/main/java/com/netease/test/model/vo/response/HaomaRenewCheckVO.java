package com.netease.test.model.vo.response;

/**
 * 非登录状态下，校验帐号及验证码的响应内容
 *
 * @author xiacongling on 2017/4/27.
 */
public class HaomaRenewCheckVO {
    /**
     * 是否为可续费靓号
     */
    private Boolean haoma;

    public Boolean getHaoma() {
        return haoma;
    }

    public void setHaoma(Boolean haoma) {
        this.haoma = haoma;
    }
}
