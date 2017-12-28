package com.netease.test.model.vo.response;

/**
 * 帐户信息
 *
 * @author xiacongling on 2017/3/7.
 */
public class AccountVO {
    private UserInfoVO userInfo;
    private OrderStatusVO orderInfo;

    public UserInfoVO getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoVO userInfo) {
        this.userInfo = userInfo;
    }

    public OrderStatusVO getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderStatusVO orderInfo) {
        this.orderInfo = orderInfo;
    }
}
