package com.netease.test.model.vo.response;


/**
 * 三方支付链接
 *
 * @author xiacongling on 2017/3/8.
 */
public class PaymentUrlVO {
    /**
     * 链接地址
     */
    private String payUrl;

    /**
     * 价格
     */
    private String price;

    /**
     * 订单号
     */
    private String order;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }
}
