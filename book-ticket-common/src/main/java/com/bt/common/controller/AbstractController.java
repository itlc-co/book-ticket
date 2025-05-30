package com.bt.common.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.bt.common.entity.Entity;
import com.bt.common.entity.ResponseCode;
import com.bt.common.entity.ResponseResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description: controller 控制器基类
 *
 * @author lc-co
 * @version 1.0
 * @date 2022-08-06  17:57
 */
public abstract class AbstractController {

    /**
     * 获取request
     * @return 请求实体
     */
    protected abstract HttpServletRequest getRequest();


    /**
     * 获取response
     * @return 响应实体
     */
    protected abstract HttpServletResponse getResponse();


    /**
     * 返回成功数据
     */
    public static <T extends Entity> ResponseResult<T> success(T t) {
        return ResponseResult.success(t);
    }



    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected <T extends Entity> ResponseResult<T> toResponse(Integer rows) {
        return rows > 0 ? success() : fail();
    }

    /**
     * 响应返回结果
     *
     * @param data data数据
     * @return 响应结果
     */
    protected <T extends Entity> ResponseResult<T> toResponse(T data) {
        return ObjectUtil.isNotNull(data) ? success(data) : fail();
    }


    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected <T extends Entity> ResponseResult<T> toResponse(boolean result) {
        return result ? success() : fail();
    }

    /**
     * 返回成功
     */
    public <T extends Entity> ResponseResult<T> success() {
        return ResponseResult.success();
    }

    /**
     * 返回失败消息
     */
    public <T extends Entity> ResponseResult<T> error() {
        return ResponseResult.error();
    }

    /**
     * 返回成功消息
     */
    public <T extends Entity> ResponseResult<T> success(String message) {
        return ResponseResult.success(ResponseCode.SUCCESS.getCode(), message, null);
    }

    /**
     * 返回失败消息
     */
    public <T extends Entity> ResponseResult<T> error(String message) {
        return ResponseResult.error(ResponseCode.ERROR.getCode(), message, null);
    }

    /**
     * 返回错误码消息
     */
    public <T extends Entity> ResponseResult<T> error(Integer code, String message) {
        return ResponseResult.error(code, message, null);
    }


    /**
     * 返回失败
     */
    public <T extends Entity> ResponseResult<T> fail() {
        return ResponseResult.fail();
    }

    /**
     * 返回失败消息
     */
    public <T extends Entity> ResponseResult<T> fail(String msg) {
        return ResponseResult.fail(msg);
    }

    /**
     * 返回失败消息状态码
     */
    public <T extends Entity> ResponseResult<T> fail(Integer code, String message) {
        return ResponseResult.fail(code, message, null);
    }

    /**
     * 返回失败消息状态码
     */
    public <T extends Entity> ResponseResult<T> fail(ResponseCode responseCode) {
        return ResponseResult.fail(responseCode);
    }

    /**
     * 返回成功消息状态码
     */
    public <T extends Entity> ResponseResult<T> success(ResponseCode responseCode) {
        return ResponseResult.success(responseCode);
    }


    /**
     * 返回异常消息状态码
     */
    public <T extends Entity> ResponseResult<T> error(ResponseCode responseCode) {
        return ResponseResult.error(responseCode);
    }


    /**
     * Description: 请求重定向
     *
     * @param url 重定向url
     * @return {@link String }
     * @date 2022-09-22 16:34
     */
    public String redirect(String url) {
        return StrUtil.format("redirect:{}", url);
    }

}
