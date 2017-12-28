package com.netease.test.model.vo.request;

import java.util.LinkedList;
import java.util.List;

/**
 * 单类推荐列表请求
 *
 * @author xiacongling on 2017/3/7.
 */
public class MoreRecommendRequestVO {
    private String module;
    private int page = 1;
    private List<String> filter = new LinkedList<String>();

    public MoreRecommendRequestVO() {
    }

    public MoreRecommendRequestVO(String module) {
        this.module = module;
    }

    public MoreRecommendRequestVO(String module, int page, List<String> filter) {
        this.module = module;
        this.page = page;
        this.filter = filter;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<String> getFilter() {
        return filter;
    }

    public void setFilter(List<String> filter) {
        this.filter = filter;
    }
}
