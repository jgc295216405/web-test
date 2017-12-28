package com.netease.test.model.log;

import com.netease.test.model.Mo.RuleType;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hzzenghonghai on 2017/3/8.
 * 靓号规则枚举
 * 和数据库中的haoma_rule表中的name列完全对应
 */
public enum Rule {

    A6(4, "6A", RuleType.Same), A5(3, "5A", RuleType.Same), A4(2, "4A", RuleType.Same),
    A3(1, "3A", RuleType.Same), A2(0, "2A", RuleType.Same),

    ABCDEF(8, "6顺", RuleType.Series), ABCDE(7, "5顺", RuleType.Series),
    ABCD(6, "4顺", RuleType.Series), ABC(5, "3顺", RuleType.Series),

    ABABAB(10, "ABABAB", RuleType.Repetition), ABAB(9, "ABAB", RuleType.Repetition),

    Date8(12, "日期", RuleType.Date), Date4(11, "日期", RuleType.Date),

    S520(13, "特殊含义", RuleType.Other), S521(14, "特殊含义", RuleType.Other), S1314(15, "特殊含义", RuleType.Other),

    DOMAIN_163(16, "@163.com", RuleType.Domain), DOMAIN_126(17, "@126.com", RuleType.Domain),

    LEN_1(18, "1位", RuleType.Length), LEN_2(19, "2位", RuleType.Length), LEN_3(20, "3位", RuleType.Length),
    LEN_4(21, "4位", RuleType.Length), LEN_5(22, "5位", RuleType.Length), LEN_6(23, "6位", RuleType.Length),
    LEN_7_MORE(24, "7位及以上", RuleType.Length),

    END_8(25, "8结尾", RuleType.Ending), END_6(26, "6结尾", RuleType.Ending),

    ONLY_ALPH(27, "仅字母", RuleType.Consistent), ONLY_DIG(28, "仅数字", RuleType.Consistent), HAS_DELIM(29, "含分隔符", RuleType.Consistent);

    public final int code;
    public final String desc;
    public final RuleType type;

    Rule(int code, String desc, RuleType type) {
        this.code = code;
        this.desc = desc;
        this.type = type;
    }

    public static Set<Rule> rulesOfType(RuleType type) {
        Set<Rule> typeRules = new HashSet<Rule>();
        for (Rule rule : values()) {
            if (rule.getType() == type) {
                typeRules.add(rule);
            }
        }
        return typeRules;
    }

    public static Rule fromDomainString(String domain) {
        for (Rule rule : values()) {
            if (rule.type == RuleType.Domain && rule.getDesc().equalsIgnoreCase(domain)) {
                return rule;
            }
        }
        throw new IllegalArgumentException("unsupported domain: " + domain);
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public RuleType getType() {
        return type;
    }
}