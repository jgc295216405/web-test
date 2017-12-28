package com.netease.test.model.vo.response;

import java.util.LinkedList;
import java.util.List;

/**
 * 靓号支付价格
 *
 * @author xiacongling on 2017/3/7.
 */
public class HaomaPayPriceVO {
    /**
     * 所在域
     */
    private String domain;

    /**
     * 优惠文案
     */
    private String discount;

    /**
     * 价格选项
     */
    private List<PriceVO> priceMap = new LinkedList<PriceVO>();

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public List<PriceVO> getPriceMap() {
        return priceMap;
    }

    public void setPriceMap(List<PriceVO> priceMap) {
        this.priceMap = priceMap;
    }

    /**
     * 添加一种价格
     */
    public void addPrice(PriceVO price) {
        this.priceMap.add(price);
    }
}
