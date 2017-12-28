package com.netease.test.model.vo.response;

import java.util.Set;

/**
 * 分类靓号信息
 *
 * @author xiacongling on 2017/3/7.
 */
public class HaomaFilteringVO extends HaomaRecommendVO {
    private Set<String> filters;

    public Set<String> getFilters() {
        return filters;
    }

    public void setFilters(Set<String> filters) {
        this.filters = filters;
    }
}
