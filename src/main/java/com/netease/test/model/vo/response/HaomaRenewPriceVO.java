package com.netease.test.model.vo.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 号码价格
 *
 * @author xiacongling on 2017/3/7.
 */
public class HaomaRenewPriceVO implements Serializable {
    /**
     * 主帐号
     */
    private String ssn;

    /**
     * 优惠文案
     */
    private String discount;

    /**
     * 过期时间
     */
    private Long expireTime;

    /**
     * 价格详情
     */
    private List<PriceVO> priceMap = new ArrayList<PriceVO>();

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public List<PriceVO> getPriceMap() {
        return priceMap;
    }

    public void setPriceMap(List<PriceVO> priceMap) {
        this.priceMap = priceMap;
    }

    /**
     * 添加价格选项
     */
    public void addPrice(PriceVO price) {
        this.priceMap.add(price);
    }
}
