package com.netease.test.model.vo.response;


import java.math.BigDecimal;

/**
 * 靓号订购状态
 *
 * @author xiacongling on 2017/3/7.
 */
public class OrderStatusVO {
//    @JSONField(serializeUsing = PriceSerializer.class)
    private BigDecimal primaryFee;

//    @JSONField(serializeUsing = PriceSerializer.class)
    private BigDecimal serviceFee;

    private String payTime;

    private String expireTime;

    private Boolean renewable;

    public BigDecimal getPrimaryFee() {
        return primaryFee;
    }

    public void setPrimaryFee(BigDecimal primaryFee) {
        this.primaryFee = primaryFee;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getRenewable() {
        return renewable;
    }

    public void setRenewable(Boolean renewable) {
        this.renewable = renewable;
    }
}
