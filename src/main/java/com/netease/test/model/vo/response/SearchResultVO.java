package com.netease.test.model.vo.response;

import java.util.List;

/**
 * 搜索结果
 *
 * @author xiacongling on 2017/3/7.
 */
public class SearchResultVO {
    public static final String SEARCH_HIT = "0";//搜索命中
    public static final String SEARCH_NOTLIANGHAO_NOTEMPTY = "1";//搜索结果为非靓号且推荐不为空
    public static final String SEARCH_NOTLIANGHAO_EMPTY = "2";//搜索结果为非靓号且推荐集为空
    public static final String SEARCH_LIANGHAO_NOTEMPTY = "3";//搜索结果为已注册靓号且推荐不为空
    public static final String SEARCH_LIANGHAO_EMPTY = "4";//搜索结果已注册靓号且推荐集为空

    /**
     * 搜索是否精确命中
     */
    private String type;

    /**
     * 搜索推荐过滤条件
     */
    private List<FilterVO> filter;

    /**
     * 搜索推荐号码列表
     */
    private List<HaomaFilteringVO> haomaList;

    public SearchResultVO() {
        // do nothing
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FilterVO> getFilter() {
        return filter;
    }

    public void setFilter(List<FilterVO> filter) {
        this.filter = filter;
    }

    public List<HaomaFilteringVO> getHaomaList() {
        return haomaList;
    }

    public void setHaomaList(List<HaomaFilteringVO> haomaList) {
        this.haomaList = haomaList;
    }
}
