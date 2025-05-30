package com.bt.common.exception;

/**
 * auth 认证相关异常
 * code 一致：9090
 * msg 不一致
 */
public class AuthException extends BaseException {

    private static final long serialVersionUID = 4175746845786365707L;

    /**
     * 认证异常code
     */
    public static final Integer AUTH_ERROR_CODE = 9090;
    /**
     * 模块名
     */
    private static final String MODULE_NAME = "auth";

    public AuthException(String msg) {
        super(MODULE_NAME, AUTH_ERROR_CODE, msg, null);
    }


    public AuthException(String msg, Object... args) {
        super(MODULE_NAME, AUTH_ERROR_CODE, msg, args);
    }

    public AuthException(Integer code, String msg) {
        this(MODULE_NAME, code, msg, null);
    }

    public AuthException(Integer code, String msg, Object... args) {
        super(MODULE_NAME, code, msg, args);
    }

}
