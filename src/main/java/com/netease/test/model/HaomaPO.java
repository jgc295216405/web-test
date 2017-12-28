package com.netease.test.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;

public class HaomaPO implements Serializable {
    private Long id;

    private String ssn;

    private Integer reserved;

    private String rules;

    private Integer feeSpecified;

    private BigDecimal primaryFee;

    private BigDecimal serviceFee;

    private Double weight;

    private String highlights;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn == null ? null : ssn.trim();
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public Integer getFeeSpecified() {
        return feeSpecified;
    }

    public void setFeeSpecified(Integer feeSpecified) {
        this.feeSpecified = feeSpecified;
    }

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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}