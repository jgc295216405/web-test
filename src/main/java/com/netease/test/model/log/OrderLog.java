package com.netease.test.model.log;



import java.math.BigDecimal;

/**
 * Created by hzjiaoguangcai on 2017/6/16.
 */
public class OrderLog extends BaseLog {


    private String token;
    private FlowTypeEnum flow;
    private String ssn;
    private String month;
    private String primaryFee;
    private String serviceFee;
    private String fee;

    private PaymentMethod payType;
    private OrderLogStatusEnum orderStatus;
    private String orderId;
    private boolean loginStatus;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public FlowTypeEnum getFlow() {
        return flow;
    }

    public void setFlow(FlowTypeEnum flow) {
        this.flow = flow;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = null == fee ? BigDecimal.ZERO.toPlainString() : fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = null == fee ? BigDecimal.ZERO.toPlainString() : fee.toPlainString();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPrimaryFee() {
        return primaryFee;
    }

    public void setPrimaryFee(BigDecimal primaryFee) {
        this.primaryFee = null == primaryFee ? BigDecimal.ZERO.toPlainString() : primaryFee.toPlainString();
    }

    public String getServiceFee() {
        return serviceFee;
    }
    public void setServiceFee(String serviceFee) {
        this.serviceFee = null == serviceFee ? BigDecimal.ZERO.toPlainString() : serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = null == serviceFee ? BigDecimal.ZERO.toPlainString() : serviceFee.toPlainString();
    }

    public PaymentMethod getPayType() {
        return payType;
    }

    public void setPayType(PaymentMethod payType) {
        this.payType = payType;
    }

    public OrderLogStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderLogStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}
