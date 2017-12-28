package com.netease.test.model.vo.response;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author xiacongling on 2017/3/7.
 */
public class MoreModuleRecommendVO {
    /**
     * 过滤器列表
     */
    private Collection<FilterVO> filter = new LinkedList<FilterVO>();

    /**
     * 号码列表
     */
    private Collection<HaomaRecommendVO> haomaList = new LinkedList<HaomaRecommendVO>();

    /**
     * 模块 ID
     */
    private Long moduleId;

    /**
     * 模块 key, 用于对应图标
     */
    private String module;

    /**
     * 模块名称 (中文文案)
     */
    private String moduleName;

    /**
     * 总量
     */
    private String total;


    public MoreModuleRecommendVO() {
        // do nothing
    }

    public Collection<FilterVO> getFilter() {
        return filter;
    }

    public void setFilter(Collection<FilterVO> filter) {
        this.filter = filter;
    }

    public Collection<HaomaRecommendVO> getHaomaList() {
        return haomaList;
    }

    public void setHaomaList(Collection<HaomaRecommendVO> haomaList) {
        this.haomaList = haomaList;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void addHaoma(HaomaRecommendVO haoma, HaomaRecommendVO... moreHaoma) {
        this.haomaList.add(haoma);
        if (moreHaoma != null) {
            Collections.addAll(this.haomaList, moreHaoma);
        }
    }

    public void addHaoma(Collection<HaomaRecommendVO> haomaCollection) {
        if (haomaCollection != null) {
            this.haomaList.addAll(haomaCollection);
        }
    }

    public void addFilter(FilterVO filter, FilterVO... moreFilters) {
        this.filter.add(filter);
        if (moreFilters != null) {
            Collections.addAll(this.filter, moreFilters);
        }
    }

    public void addFilter(Collection<HaomaRecommendVO> haomaCollection) {
        if (haomaCollection != null) {
            this.haomaList.addAll(haomaCollection);
        }
    }
}
