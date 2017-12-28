package com.netease.test.model.Mo;


import com.netease.test.model.vo.response.IndexModuleRecommendVO;

import java.util.List;

/**
 * Created by hzjiaoguangcai on 2017/6/13.
 */
public class RecommendMO extends BaseLog {

    /**
     * 首页推荐列表
     */
    private List<String> ssns;
    /*
      模块序号
     */
    private Long module;
    /**
     * 第几页
     */
    private Integer page;
    /**
     * 显示的条数
     */
    private Integer size;
    /**
     * 过滤器的id
     */
    private List<Long> filters;
    /**
     * 首页推荐号码
     */
    private List<IndexModuleRecommendVO> recommends;


    public RecommendMO(LogTypeEnum logTypeEnum, List<IndexModuleRecommendVO> recommends) {
        super(logTypeEnum);
        this.recommends = recommends;
    }
    public RecommendMO(LogTypeEnum logTypeEnum, Long module) {
        this(logTypeEnum,module,null);
    }
    public RecommendMO(LogTypeEnum logTypeEnum, Long module, List<Long> filters) {
        super(logTypeEnum);
        this.module = module;
        this.filters = filters;
    }

    public List<String> getSsns() {
        return ssns;
    }

    public void setSsns(List<String> ssns) {
        this.ssns = ssns;
    }

    public Long getModule() {
        return module;
    }

    public void setModule(Long module) {
        this.module = module;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<Long> getFilters() {
        return filters;
    }

    public void setFilters(List<Long> filters) {
        this.filters = filters;
    }

    public List<IndexModuleRecommendVO> getRecommends() {
        return recommends;
    }

    public void setRecommends(List<IndexModuleRecommendVO> recommends) {
        this.recommends = recommends;
    }
}
