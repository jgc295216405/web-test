package com.netease.test.model.vo.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 过滤器, 名称以及一系列过滤条件 Filter.
 *
 * @author xiacongling on 2017/3/7.
 */
public class FilterVO implements Comparable<FilterVO> {
    private String filterId;
    private String filterName;
    private List<RuleVO> ruleList = new LinkedList<RuleVO>();

    @JSONField(serialize = false, deserialize = false)
    @JsonIgnore
    private Integer seq;

    public FilterVO() {
    }

    public FilterVO(String filterId, String filterName, List<RuleVO> ruleList) {
        this.filterId = filterId;
        this.filterName = filterName;
        this.ruleList = ruleList;
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public List<RuleVO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<RuleVO> ruleList) {
        this.ruleList = ruleList;
    }

    public void addRule(RuleVO rule, RuleVO... moreRules) {
        this.ruleList.add(rule);
        if (moreRules != null) {
            Collections.addAll(this.ruleList, moreRules);
        }
    }

    public void addRule(Collection<RuleVO> rules) {
        if (rules != null) {
            this.ruleList.addAll(rules);
        }
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public int compareTo(FilterVO that) {
        if (that == null) {
            return -1;
        }
        return ObjectUtils.compare(this.seq, that.seq);
    }
}
