package com.bt.common.base;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * 分页参数基类
 */
public abstract class BasePageRequest implements Serializable {

    private static final long serialVersionUID = 4261736565506172616L;


    /**
     * 排序的方式desc（降序）或者asc(升序)
     */
    @Length(min = 1, max = 1024, message = "排序的方式名长度不能超过1-1024")
    private String orderType = "asc";

    /**
     * 当前记录起始索引
     */
    @Min(value = 1, message = "页码最小为1")
    private Integer curPage = 1;

    /**
     * 偏移量（分页起始）
     */
    @Min(value = 0, message = "偏移量最小为0")
    private Integer offset = 0;


    /**
     * 每页显示记录数
     */
    @Min(value = 0, message = "页码容量最小为0")
    private Integer pageSize = 10;

    /**
     * 排序列名
     */
    @Length(min = 1, max = 1024, message = "排序列名长度不能超过1-1024")
    private String orderByColumn = "price";

    public BasePageRequest(String orderType, Integer curPage, Integer offset, Integer pageSize, String orderByColumn) {
        this.orderType = orderType;
        this.curPage = curPage;
        this.offset = offset;
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
    }

    public BasePageRequest(String orderType, Integer curPage, Integer pageSize, String orderByColumn) {
        this.orderType = orderType;
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
    }

    public BasePageRequest() {
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        setOffset();
    }

    public String getOrderByColumn() {
        return this.orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public void setOffset() {
        if (this.curPage != null && this.pageSize != null) {
            this.offset = (curPage - 1) * pageSize;
        }
    }

    public Integer getOffset() {
        return this.offset;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
        setOffset();
    }
}
