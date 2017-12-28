package com.netease.test.model.vo.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * 价格
 *
 * @author xiacongling on 2017/3/7.
 */
public class PriceVO {
    /**
     * 原价
     */
//    @JSONField(serializeUsing = PriceSerializer.class)
    private BigDecimal showPrice;

    /**
     * 实际价格
     */
//    @JSONField(serializeUsing = PriceSerializer.class)
    private BigDecimal truePrice;

    /**
     * 月数
     */
    private String month;

    public BigDecimal getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(BigDecimal showPrice) {
        this.showPrice = showPrice;
    }

    public BigDecimal getTruePrice() {
        return truePrice;
    }

    public void setTruePrice(BigDecimal truePrice) {
        this.truePrice = truePrice;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
