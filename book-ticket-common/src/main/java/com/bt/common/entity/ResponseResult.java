package com.bt.common.entity;


import cn.hutool.core.util.ObjectUtil;
import com.bt.common.base.BaseResponseResult;

import java.io.Serializable;

/**
 * 结果集封装
 *
 * @param <T> 实体类型
 */
public class ResponseResult<T extends Entity> extends BaseResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 5265737743542065787L;


    public ResponseResult(Integer code, String message, T data) {
        super(code, message, data);
    }

    public ResponseResult() {
        super();
    }

    /**
     * 结果集构造器
     *
     * @param code 状态码
     * @param message  信息
     * @param data 数据
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> response(Integer code, String message, U data) {
        return new ResponseResult<>(code, message, data);
    }

    /**
     * 成功状态下的结果集
     *
     * @param code 状态码
     * @param message  信息
     * @param data 数据
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> success(Integer code, String message, U data) {
        return response(code, message, data);
    }

    /**
     * 成功状态下固定状态码与信息的结果集
     *
     * @param data 数据
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> success(U data) {
        ResponseCode responseCode = ResponseCode.SUCCESS;
        if (ObjectUtil.isNull(data)) {
            responseCode = ResponseCode.DATA_NOT_FOUND;
        }
        return success(responseCode, data);
    }

    /**
     * 成功状态下固定状态码与信息与无数据返回的结果集
     *
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> success() {
        return success(ResponseCode.SUCCESS);
    }

    /**
     * 成功状态下指定状态码的结果集
     *
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> success(Integer code) {
        return success(code, ResponseCode.SUCCESS.getMessage(), null);
    }

    /**
     * 失败状态下的结果集
     *
     * @param code 状态码
     * @param message  信息
     * @param data 数据
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> fail(int code, String message, U data) {
        return response(code, message, data);
    }

    /**
     * 失败状态下固定状态码的结果集
     *
     * @param message  信息
     * @param data 数据
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> fail(String message, U data) {
        return fail(ResponseCode.FAILURE.getCode(), message, data);
    }


    /**
     * 失败状态下固定状态码且不需要返回数据的结果集
     *
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> fail() {
        return fail(ResponseCode.FAILURE, null);
    }


    /**
     * 失败状态下固定状态码且不需要返回数据的结果集
     *
     * @param message 信息
     * @return response对象
     */
    public static <U extends Entity> ResponseResult<U> fail(String message) {
        return fail(ResponseCode.FAILURE.getCode(), message, null);
    }


    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error() {
        return error(ResponseCode.ERROR, null);
    }

    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error(Integer code) {
        return response(code, ResponseCode.ERROR.getMessage(), null);
    }

    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error(Integer code, String message) {
        return error(code, message, null);
    }


    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error(String message) {
        return response(ResponseCode.ERROR.getCode(), message, null);
    }


    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error(ResponseCode responseCode) {
        return response(responseCode.getCode(), responseCode.getMessage(), null);
    }


    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error(ResponseCode responseCode, U data) {
        return response(responseCode.getCode(), responseCode.getMessage(), data);
    }

    /**
     * 异常情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> error(Integer code, String message, U data) {
        return response(code, message, data);
    }


    /**
     * 成功情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> success(ResponseCode responseCode) {
        return success(responseCode.getCode(), responseCode.getMessage(), null);
    }

    /**
     * 成功情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> success(ResponseCode responseCode, U data) {
        return success(responseCode.getCode(), responseCode.getMessage(), data);
    }


    /**
     * 失败情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> fail(ResponseCode responseCode) {
        return fail(responseCode.getCode(), responseCode.getMessage(), null);
    }


    /**
     * 失败情况结果集封装
     *
     * @return 结果集
     */
    public static <U extends Entity> ResponseResult<U> fail(ResponseCode responseCode, U data) {
        return fail(responseCode.getCode(), responseCode.getMessage(), data);
    }
    

}
