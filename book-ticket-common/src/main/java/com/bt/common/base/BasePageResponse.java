package com.bt.common.base;


import com.bt.common.entity.Entity;

import java.util.List;

/**
 * 分页结果基类
 * @param <T> 实体类型
 */
public abstract class BasePageResponse<T extends Entity> extends Entity{

    private static final long serialVersionUID = 4261736550616765496L;

    /**
     * 结果集
     */
    private List<T> list;

    /**
     * 总记录数
     */
    private Long total;


    /**
     * 当前记录起始索引
     */
    private Integer pageNum;

    /**
     * 每页显示记录数
     */
    private Integer pageSize;

    /**
     * 当前页的数量
     */
    private Integer size;

    /**
     * 前一页
     */
    private Integer prePage;

    /**
     * 下一页
     */
    private Integer nextPage;

    /**
     * 总页数
     */
    private Integer pages;

    public BasePageResponse(List<T> list, Long total, Integer pageNum, Integer pageSize, Integer size, Integer prePage, Integer nextPage, Integer pages) {
        this.list = list;
        this.total = total;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.size = size;
        this.prePage = prePage;
        this.nextPage = nextPage;
        this.pages = pages;
    }

    public BasePageResponse() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPrePage() {
        return prePage;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
