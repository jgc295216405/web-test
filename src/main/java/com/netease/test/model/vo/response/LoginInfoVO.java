package com.netease.test.model.vo.response;

/**
 * 登录状态
 *
 * @author xiacongling on 2017/4/28.
 */
public class LoginInfoVO {
    private Boolean login = false;
    private String user = null;

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
