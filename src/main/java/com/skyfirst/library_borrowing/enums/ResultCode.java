package com.skyfirst.library_borrowing.enums;

/**
 * 响应状态码枚举
 * 包含即时项目中常用的响应状态
 */
public enum ResultCode {
    // 通用状态码
    SUCCESS(200, "请求成功"),
    FAIL(500, "服务器错误，请重试"),
    PARAM_ERROR(400, "参数错误"),
    UNAUTHORIZED(401, "未登录或登陆已过期，请重新登录"),
    FORBIDDEN(403, "权限不足"),
    NOT_FOUND(404, "资源不存在"),
    CONFLICT(409, "资源重复");

    // 业务相关状态码（暂无，后续有需要添加）
    // TODO 可能需要添加业务相关状态码


    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}