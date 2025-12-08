package com.skyfirst.library_borrowing.exception;

import com.skyfirst.library_borrowing.common.IResultCode;
import lombok.Getter;

/**
 * @description: 自定义业务逻辑异常
 * @author: bingxunqing
 * @date: 2025/12/8 23:25
 */
@Getter
public class BusinessException extends RuntimeException {

    private final Integer code;
    private final String message;

    public BusinessException(String message) {
        super(message);
        // 默认为通用失败
        this.code = 500;
        this.message = message;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    // 支持直接传入枚举
    // 用法：throw new BusinessException(ResultCode.PASSWORD_ERROR);
    public BusinessException(IResultCode resultCode) {
        super(resultCode.getMessage());
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
}