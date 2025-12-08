package com.skyfirst.library_borrowing.common;

/**
 * @program: library_borrowing_backend
 * @description: 错误码与错误类型对应，如果有新业务的错误码请在此处定义
 * @author: bingxunqing
 * @create: 2025-12-08 22:44
 */
    public enum ResultCode implements IResultCode {
        SUCCESS(0, "成功"),
        ERROR(500, "失败"),
        NOT_FOUND(404, "未找到"),
        UNAUTHORIZED(401, "未授权"),
        FORBIDDEN(403, "禁止访问"),
        FAILED(400, "操作失败"),
    VALIDATE_FAILED(404,"参数校验失败"),

    // 下面是业务逻辑错误码

    PASSWORD_ERROR(1002, "账号或密码错误"),



    ;


        private final int code;
        private final String message;
        ResultCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
