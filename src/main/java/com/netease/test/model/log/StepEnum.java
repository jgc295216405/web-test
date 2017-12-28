package com.netease.test.model.log;

/**
 * Created by hzjiaoguangcai on 2017/6/16.
 */
public enum  StepEnum {
    /**
     * 进入购买页或者续费页
     */
    ENTER,
    /**
     * 发送短信操作
     */
    SEND_SMS,
    /**
     * 进入购买套餐页
     */
    PAY_NEXT,
    /**
     * 提交支付
     */
    PAY_SUBMIT,
    /**
     * 支付结果
     */
    PAY_RESULT
}
