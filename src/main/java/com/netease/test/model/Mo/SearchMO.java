package com.netease.test.model.Mo;

import com.netease.test.model.vo.response.FilterVO;
import com.netease.test.model.vo.response.HaomaFilteringVO;

import java.util.List;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public class SearchMO extends BaseLog {
    /**
     * 搜索的号码
     */
    private String query;
    /**
     * "0";//搜索命中
     * "1";//搜索结果为非靓号且推荐不为空
     * "2";//搜索结果为非靓号且推荐集为空
     * "3";//搜索结果为已注册靓号且推荐不为空
     * "4";//搜索结果已注册靓号且推荐集为空
     */
    private String type;

    /**
     * 调用主系统后推荐到前端的靓号集合
     */
    private List<HaomaFilteringVO> forSearches;

    /**
     * 调用主系统后不可注册的靓号集合
     */
    private List<HaomaFilteringVO> delForSearches;
    /**
     * 推荐的过滤列表
     */
    private List<FilterVO> filterVOs;

    public SearchMO(LogTypeEnum logTypeEnum, String query, String type) {
        super(logTypeEnum);
        this.query = query;
    }

    public SearchMO(LogTypeEnum logTypeEnum, String type, List<FilterVO> filter, List<HaomaFilteringVO> haomaList, List<HaomaFilteringVO> delFilteringVOs, String query) {
        super(logTypeEnum);
        this.query = query;
        this.type = type;
        this.filterVOs=filter;
        this.forSearches=haomaList;
        this.delForSearches=delFilteringVOs;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public List<HaomaFilteringVO> getForSearches() {
        return forSearches;
    }

    public void setForSearches(List<HaomaFilteringVO> forSearches) {
        this.forSearches = forSearches;
    }

    public List<HaomaFilteringVO> getDelForSearches() {
        return delForSearches;
    }

    public void setDelForSearches(List<HaomaFilteringVO> delForSearches) {
        this.delForSearches = delForSearches;
    }

    public List<FilterVO> getFilterVOs() {
        return filterVOs;
    }

    public void setFilterVOs(List<FilterVO> filterVOs) {
        this.filterVOs = filterVOs;
    }
}
