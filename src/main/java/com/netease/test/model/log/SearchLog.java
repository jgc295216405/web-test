package com.netease.test.model.log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public class SearchLog extends BaseLog {
    /**

     * keyword
     * rules	keyword命中的规则
     * hit	是否命中
     * generateNum	生成的数量
     * availableNum	可注册的数量
     * availableList	生成的帐号及各自的规则
     */
    private String keyword;
    private List<Rule> rules;
    private Boolean hit;
    private Integer generateNum;
    private Integer availableNum;
    private Map<String, List<Rule>> availableList = new HashMap<String, List<Rule>>();

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public Boolean getHit() {
        return hit;
    }

    public void setHit(Boolean hit) {
        this.hit = hit;
    }

    public Integer getGenerateNum() {
        return generateNum;
    }

    public void setGenerateNum(Integer generateNum) {
        this.generateNum = generateNum;
    }

    public Integer getAvailableNum() {
        return availableNum;
    }

    public void setAvailableNum(Integer availableNum) {
        this.availableNum = availableNum;
    }

    public Map<String, List<Rule>> getAvailableList() {
        return availableList;
    }

    public void setAvailableList(Map<String, List<Rule>> availableList) {
        this.availableList = availableList;
    }
}
