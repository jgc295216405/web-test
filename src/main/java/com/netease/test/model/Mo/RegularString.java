package com.netease.test.model.Mo;
public class RegularString {

    /**
     * 字符串规则类型
     */
    private RuleType ruleType;

    /**
     * 规则
     */
    private Rule rule;

    /**
     * 符合规则的字符串长度
     */
    private int length;

    /**
     * 规则子串开始的下标
     */
    private int start;

    /**
     * 规则子串结束的下标
     */
    private int end;

    /**
     * 符合某规则的子串
     */
    private String regularStr;

    public RegularString() {
    }

    public RegularString(RuleType ruleType, String regularStr, Rule rule, int length, int start, int end) {
        this.ruleType = ruleType;
        this.regularStr = regularStr;
        this.rule = rule;
        this.length = length;
        this.start = start;
        this.end = end;
    }

    public RegularString(Rule rule, String regularStr) {
        this(rule.type, regularStr, rule, regularStr.length(), 0, regularStr.length());
    }

    public RuleType getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleType ruleType) {
        this.ruleType = ruleType;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getRegularStr() {
        return regularStr;
    }

    public void setRegularStr(String regularStr) {
        this.regularStr = regularStr;
    }

    /**
     * 是否包含另一个规则子串
     *
     * @param regularStr
     * @return
     */
    public boolean containsStr(RegularString regularStr) {
        return this.getStart() <= regularStr.getStart() && this.getEnd() >= regularStr.getEnd();
    }

    @Override
    public String toString() {
        return "RegularString{" +
                "ruleType=" + ruleType +
                ", rule=" + rule +
                ", length=" + length +
                ", start=" + start +
                ", end=" + end +
                ", regularStr='" + regularStr + '\'' +
                '}';
    }
}