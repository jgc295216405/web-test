package com.netease.test.model.vo.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.ObjectUtils;

/**
 * 过滤条件
 *
 * @author xiacongling on 2017/3/7.
 */
public class RuleVO implements Comparable<RuleVO> {
    private String ruleId;
    private String ruleName;

    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    private Integer seq;

    public RuleVO() {
    }

    public RuleVO(String ruleId, String ruleName) {
        this.ruleId = ruleId;
        this.ruleName = ruleName;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RuleVO ruleVO = (RuleVO) o;

        return ruleId.equals(ruleVO.ruleId);
    }

    @Override
    public int hashCode() {
        return ruleId.hashCode();
    }

    @Override
    public int compareTo(RuleVO that) {
        if (that == null) {
            return -1;
        }
        return ObjectUtils.compare(this.seq, that.seq);
    }
}
