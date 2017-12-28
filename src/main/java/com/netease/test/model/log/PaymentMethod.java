package com.netease.test.model.log;

/**
 * 支付方式
 *
 * @author xiacongling on 2017/4/6.
 */
public enum PaymentMethod {
    UNKNOWN(0, "未知"),
    ALIPAY(1, "支付宝"),
    WECHAT_PAY(2, "微信支付"),
    NTES_PAY(3, "网易支付"),
    SMS_PAY(4, "手机支付"),

    ;

    public final int code;
    public final String text;

    PaymentMethod(int code, String text) {
        this.code = code;
        this.text = text;
    }



    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public static PaymentMethod parseOf(int i) {
        for (PaymentMethod paymentMethod : values()) {
            if (paymentMethod.getCode() == i) {
                return paymentMethod;
            }
        }

        return UNKNOWN;
    }
}
