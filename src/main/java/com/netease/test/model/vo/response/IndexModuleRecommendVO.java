package com.netease.test.model.vo.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 模块
 *
 * @author xiacongling on 2017/3/7.
 */
public class IndexModuleRecommendVO implements Comparable<IndexModuleRecommendVO> {
    /**
     * 模块 ID
     */
    private Long moduleId;

    /**
     * 模块key
     */
    private String module;

    /**
     * 模块名称(显示)
     */
    private String moduleName;

    /**
     * 推荐号码列表
     */
    private List<HaomaRecommendVO> haomaList = new LinkedList<HaomaRecommendVO>();

    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    private Integer seq;

    public IndexModuleRecommendVO() {
        // do nothing
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

    public List<HaomaRecommendVO> getHaomaList() {
        return haomaList;
    }

    public void setHaomaList(List<HaomaRecommendVO> haomaList) {
        this.haomaList = haomaList;
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

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }


    public int compareTo(IndexModuleRecommendVO that) {
        if (that == null) {
            return -1;
        }
        return ObjectUtils.compare(this.seq, that.seq);
    }
}