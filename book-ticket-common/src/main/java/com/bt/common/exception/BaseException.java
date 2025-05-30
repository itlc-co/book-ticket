package com.bt.common.exception;

import cn.hutool.core.util.StrUtil;

/**
 * 自定义异常基类
 *
 * @author lc_co
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 4267365457863570746L;

    /**
     * 所属模块
     */
    private final String module;

    /**
     * 错误码
     */
    private final Integer code;

    /**
     * 错误码对应的参数
     */
    private final Object[] args;

    /**
     * 错误消息
     */
    private final String msg;

    public BaseException(String module, Integer code, String msg) {
        this(module, code, msg, null);
    }

    public BaseException(String module, Integer code, String msg, Object[] args) {
        this(module, code, msg, args, null);
    }

    public BaseException(String module, Integer code, String msg, Object[] args, Throwable e) {
        super(msg, e);
        this.module = module;
        this.code = code;
        this.args = args;
        this.msg = msg;
    }


    public String getModule() {
        return module;
    }

    public Integer getCode() {
        return code;
    }

    public Object[] getArgs() {
        return args;
    }

    @Override
    public String getMessage() {
        return StrUtil.format(msg, args);
    }

}
