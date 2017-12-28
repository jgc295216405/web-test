

/**
 * Created by hzzenghonghai on 2017/3/8.
 * 靓号规则分类，可以将靓号的所有规则分为其余几个类别：
 * 日期（4位或8位），连续（递增或递减）字符串，相同数字（字母），重复（ABAB，ABABAB），其余
 * 前4类中的规则可能具有某种包含关系，例如“77777”同时包含1个A5，两个A4,三个A3和2个A2
 */
public enum RuleType {

    Date(true),
    Series(true),
    Same(true),
    Repetition(true),
    Other(false),

    Length(true),
    Domain(false),
    Ending(true),
    Consistent(true);

    public final boolean exclusive;

    RuleType(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public boolean isExclusive() {
        return exclusive;
    }
}