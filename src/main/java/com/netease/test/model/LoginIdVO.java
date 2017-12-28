package com.netease.test.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzjiaoguangcai on 2017/6/1.
 */
public class LoginIdVO {
    /*
    通常来说，在WEB应用中，这个时候你需要把assoc_handle/mac_key保存在一个固定的地方（可以是session或者后端文件，又或者是数据库），但一定不能放在cookie里！
    */
    private String assocHandle = "";
    private String macKey = "";
    private int expiresIn = 0;

    private Map<String, String> assocData = new HashMap<String, String>();
    private Map<String, String> redirectData = new HashMap<String, String>();
    private Map<String, String> authResponse = new HashMap<String, String>();

    public String getAssocHandle() {
        return assocHandle;
    }

    public void setAssocHandle(String assocHandle) {
        this.assocHandle = assocHandle;
    }

    public String getMacKey() {
        return macKey;
    }

    public void setMacKey(String macKey) {
        this.macKey = macKey;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Map<String, String> getAssocData() {
        return assocData;
    }

    public void setAssocData(Map<String, String> assocData) {
        this.assocData = assocData;
    }

    public Map<String, String> getRedirectData() {
        return redirectData;
    }

    public void setRedirectData(Map<String, String> redirectData) {
        this.redirectData = redirectData;
    }

    public Map<String, String> getAuthResponse() {
        return authResponse;
    }

    public void setAuthResponse(Map<String, String> authResponse) {
        this.authResponse = authResponse;
    }
}
