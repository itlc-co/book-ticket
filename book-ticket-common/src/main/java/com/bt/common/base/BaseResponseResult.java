package com.bt.common.base;

import com.bt.common.entity.Entity;

import java.io.Serializable;

/**
 * 结果集基类
 *  @param <T> 实体类型
 */
public abstract class BaseResponseResult<T extends Entity> implements Serializable {

    private static final long serialVersionUID = 4261736552657375674L;


    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public BaseResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponseResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
