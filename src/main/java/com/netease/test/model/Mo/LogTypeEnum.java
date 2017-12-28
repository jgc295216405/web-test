package com.netease.test.model.Mo;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public enum LogTypeEnum {

    /**
     * 首页
     */
    INDEX,
    /**
     * 搜索
     */
    SEARCH,
    /**
     * 手机号验证
     */
    GET_PHONE_CODE,
    /**
     * 进入购买页
     */
    PAY_PAGE,
    /**
     * 推荐更多
     */
    RECOMMEND_MORE,
    /**
     * 点击分类
     */
    RECOMMEND_FILTER,
    /**
     * 提交用户信息
     */
    SUBMIT_INFO,
    /**
     * 图形验证码通过
     */
    IMG_CODE_PASS,
    /**
     * 手机验证码通过
     */
    PHONE_CODE_PASS,
    /**
     * 用户选择的域
     */
    SELECTED_DOMAIN,
    /**
     * 信息重复提交
     */
    INFO_REPEATED,
    /**
     * 密码和用户名重复
     */
    PASS_REPEATED,
    /**
     * 提交用户信息后被抢注
     */
    NEW_LOCKED,
    /**
     * 提交支付
     */
    NEW_SUBMIT_PAY,
    /**
     * 支付结果
     */
    PAY_RESULT,
    /**
     * 进入续费页面
     */
    RENEW_PAGE,
    /**
     * 提交续费信息
     */
    RENEW_SUBMIT
}
