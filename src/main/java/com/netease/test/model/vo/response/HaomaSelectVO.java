package com.netease.test.model.vo.response;

import java.util.List;

/**
 * 靓号选购信息
 *
 * @author xiacongling on 2017/3/7.
 */
public class HaomaSelectVO {
    /**
     * 域名列表
     */
    private List<String> domains;

    /**
     * 验证类型
     */
    private Integer vType;

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public Integer getvType() {
        return vType;
    }

    public void setvType(Integer vType) {
        this.vType = vType;
    }
}
