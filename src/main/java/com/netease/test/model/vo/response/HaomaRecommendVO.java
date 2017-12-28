package com.netease.test.model.vo.response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 靓号推荐信息
 *
 * @author xiacongling on 2017/3/7.
 */
public class HaomaRecommendVO {
    /**
     * 折扣文案
     */
    private String discount;

    /**
     * 高亮起止坐标对
     */
    private List<String> highlight = new ArrayList<String>();

    public HaomaRecommendVO() {
        // do nothing
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public List<String> getHighlight() {
        return highlight;
    }

    public void setHighlight(List<String> highlight) {
        this.highlight = highlight;
    }

    public void addHighlight(String highlight, String... moreHighlight) {
        this.highlight.add(highlight);
        if (moreHighlight != null) {
            Collections.addAll(this.highlight, moreHighlight);
        }
    }

    public void addHighlight(Collection<String> highlights) {
        this.highlight.addAll(highlights);
    }
}
