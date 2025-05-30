package com.bt.common.entity;

/**
 * 统一默认状态码结果集
 */
public enum ResponseCode {

    SUCCESS(200, "success"),
    FAILURE(400, "failure"),
    ERROR(500, "error"),

    ERROR_REQUEST_NOT_FIND(404, "调用失败,未寻找带该地址"),
    ERROR_REQUEST_METHOD_NOT_ALLOWED(405, "调用失败,未寻找带该地址"),
    ERROR_REQUEST_UNSUPPORTED_MEDIA_TYPE(415, "调用失败,不支持的媒体类型"),
    ERROR_REQUEST_NOT_ACCEPTABLE(406, "调用失败,不能接受的请求地址"),
    ERROR_REQUEST_INTERNAL_SERVER_ERROR(500, "调用失败,内部服务器错误"),
    ERROR_REQUEST_BAD_REQUEST(400, "请求失败"),

    SYSTEM_ERROR(10000, "内部异常出错"),
    DAO_ERROR(10001, "数据层异常出错"),
    ILLEGAL_ARGUMENT(10002, "非法参数"),
    ERROR_NOT_LOGIN(10003, "请登陆后重试"),
    ERROR_NOT_SELECT_ID(10004, "未查询到该数据,请重试"),
    ERROR_NOT_SELECT_LIST(10010, "未查询所有航班数据,请重试"),
    ERROR_SELECT_IS_NULL(10005, "该数据已逃离地球,请重试"),
    ERROR_INSERT(10006, "新增失败,请重试"),
    ERROR_CONVER(10007, "对象转换ERROR"),
    ERROR_SAVE(10008, "保存失败,请重试"),
    ERROR_UPDATE(10009, "更新失败,请重试"),
    ERROR_DELETE(100010, "删除失败,请重试"),
    ERROR_DELETE_REPEAT_SUBMIT(100011, "删除失败,请勿重复提交删除"),
    ERROR_NOT_SELECT_MAIN_USER(10012, "账号错误"),
    ERROR_DATE_NOT_USER(10013, "该数据不属于您"),
    ERROR_REPETITION_COMMIT(10015, "请勿重复提交"),
    ERROR_UPLOAD(10016, "上传失败"),
    ERROR_MOBILE_FORMAT(10017, "手机格式错误"),
    ERROR_EMAIL_FORMAT(10018, "邮件格式错误"),
    ERROR_CHECK_EMAIL_MOBILE_FORMAT(10018, "输入错误,请输入手机或邮箱号"),
    ERROR_SEND_VERIFICTION_CODE(10019, "验证码已经失效，请重新获取。"),
    ERROR_VERIFICATION_CODE(10020, "验证码输入错误。"),
    ERROR_LINK_FAILURE(10021, "链接已失效。"),
    ERROR_TOKEN_CODE(10022, "密码错误。"),
    ERROR_DATE_EXCEPTION(10023, "数据异常,请联系管理员"),
    ERROR_HAVE_NOT_RIGHT(10024, "没有权限"),
    ERROR_NOT_UPLOAD_FILE(10028, "至少上传一个文件"),
    ERROR_UPLOAD_FILE_DEFEAT(10030, "图片上传失败"),
    SYSTEM_ERROR_INKNIWN_REASON(10031, "未知异常,请联系管理员"),

    ILLEGAL_ARGUMENT_NULL(10050, "参数不得为null!"),
    ILLEGAL_ARGUMENT_NULL_ID(10051, "参数ID不得为null!"),
    OBJECT_NOT_EXSIT(10019, "实体对象不存在"),

    DATA_NOT_FOUND(6600,"暂无数据");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取指定code的状态信息实例
     *
     * @param code
     * @return 结果集
     */
    public static ResponseCode valueOf(int code) {
        ResponseCode resultCode = null;
        for (ResponseCode rc : values()) {
            if (code == rc.getCode()) {
                resultCode = rc;
            }
        }
        return resultCode;
    }
}
