package com.bt.common.entity;


import com.bt.common.base.BasePageRequest;

/**
 * 默认的分页参数
 */
public class PageRequest extends BasePageRequest {

    private static final long serialVersionUID = 50616765506172616L;


    public PageRequest(String orderType, Integer curPage, Integer offset, Integer pageSize, String orderByColumn) {
        super(orderType, curPage, offset, pageSize, orderByColumn);
    }

    public PageRequest(String orderType, Integer curPage, Integer pageSize, String orderByColumn) {
        super(orderType, curPage, pageSize, orderByColumn);
    }

    public PageRequest() {
    }

    public static BasePageRequest basePageParamByAsc(String orderByColumn) {
        return basePageParam("asc", 1, 10, orderByColumn);
    }

    public static BasePageRequest basePageParamByAsc(Integer curPage, Integer pageSize, String orderByColumn) {
        return basePageParam("asc", curPage, pageSize, orderByColumn);
    }

    public static BasePageRequest basePageParamByAsc(Integer curPage, String orderByColumn) {
        return basePageParam("asc", curPage, 10, orderByColumn);
    }

    public static BasePageRequest basePageParam(String orderType, Integer curPage, Integer pageSize, String orderByColumn) {
        return new PageRequest(orderType, curPage, pageSize, orderByColumn);
    }

    public static BasePageRequest basePageParamByDesc(String orderByColumn) {
        return basePageParam("desc", 1, 10, orderByColumn);
    }

    public static BasePageRequest basePageParamByDesc(Integer curPage, Integer pageSize, String orderByColumn) {
        return basePageParam("desc", curPage, pageSize, orderByColumn);
    }

    public static BasePageRequest basePageParamByDesc(Integer curPage, String orderByColumn) {
        return basePageParam("desc", curPage, 10, orderByColumn);
    }


}
