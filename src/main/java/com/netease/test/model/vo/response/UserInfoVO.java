package com.netease.test.model.vo.response;

/**
 * 用户基本信息
 *
 * @author xiacongling on 2017/3/7.
 */
public class UserInfoVO {
    /**
     * 用户真名(打码)
     */
    private String userName;

    /**
     * 用户身份证号(打码)
     */
    private String cardId;

    /**
     * 用户手机号(打码)
     */
    private String mb;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }
}
