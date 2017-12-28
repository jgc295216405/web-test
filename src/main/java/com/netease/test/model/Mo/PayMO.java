package com.netease.test.model.Mo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public class PayMO extends BaseLog {
    /**
     * 是否登录
     * false.未登录
     * true.登录
     */
    public Boolean login = false;
    /**
     * 支付类型
     * 1.新购买
     * 2.续费
     * 3.不区分购买和续费
     */
    private Boolean isNew = true;
    /**
     * 号码
     */
    private String ssn;
    /**
     * 用户选择的域
     */
    private String domain;
    /**
     * token标志
     */
    private String token;
    /**
     * 号码满足的规则
     */
    private Set<Rule> rules;
    /**
     * 手机号
     */
    private String ph;
    /**
     * 可用的域
     */
    private List<String> domains;
    /**
     * 用户选择的月数
     */
    private String month;
    /**
     * ALIPAY(1, "支付宝"),
     * WECHAT_PAY(2, "微信支付"),
     * NTES_PAY(3, "网易支付"),
     * SMS_PAY(4, "手机支付"),
     */
    private String payway;
    /**
     * 价格
     */
    private BigDecimal fee;
    /**
     * "success";
     * "fail";
     */
    private String payResult;
    /**
     * 订单号
     */
    private String orderId;

    /**
     * 初选费
     */
    private BigDecimal primaryFee;

    /**
     * 服务费
     */
    private BigDecimal serviceFee;

    public PayMO(LogTypeEnum logTypeEnum, String token) {
        super(logTypeEnum);

        this.token = token;
    }

    public PayMO(LogTypeEnum logTypeEnum, String domain, String haoma) {
        super(logTypeEnum);
        this.domain = domain;
        this.ssn = haoma;
    } public PayMO(LogTypeEnum logTypeEnum, boolean login, String token) {
        super(logTypeEnum);
        this.login = login;
        this.token = token;
    }

    public PayMO(LogTypeEnum logTypeEnum, String haoma, Set<Rule> rules, List<String> domains) {
        super(logTypeEnum);
        this.ssn = haoma;
        this.rules = rules;
        this.domains = domains;
    }

    public PayMO(LogTypeEnum logTypeEnum, String month, String payway, String tokenString) {
        super(logTypeEnum);
        this.month = month;
        this.payway = payway;
        this.token = tokenString;


    }

    public PayMO(LogTypeEnum submitPay, String ssn, String month, String payway, BigDecimal primaryFee, BigDecimal serviceFee, String fee, String tokenString, String orderId) {
        super(submitPay);
        this.ssn = ssn;
        this.month = month;
        this.payway = payway;
        this.fee = null == fee ? BigDecimal.ZERO : new BigDecimal(fee);
        this.serviceFee = serviceFee;
        this.primaryFee = primaryFee;
        this.token = tokenString;
        this.orderId = orderId;

    }
    public PayMO(Boolean isNew, LogTypeEnum renewSubmit, Boolean login, String ssn, String fee, String month, String payway, String orderId, String token) {
        this(renewSubmit, ssn, month, payway, null, null, fee, token, orderId);
        this.isNew = isNew;
        this.login = login;
    }

    public PayMO(Boolean isNew, LogTypeEnum logTypeEnum, String ssn, BigDecimal fee, String orderId,String payResult) {
        super(logTypeEnum);
        this.isNew=isNew;
        this.payResult=payResult;
        this.ssn=ssn;
        this.fee = fee;
        this.orderId=orderId;
        this.payResult=payResult;
    }

    public PayMO(LogTypeEnum renewPage, boolean login) {
        super(renewPage);
        this.login = login;
    }




    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<Rule> getRules() {
        return rules;
    }

    public void setRules(Set<Rule> rules) {
        this.rules = rules;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
}
