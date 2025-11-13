package com.skyfirst.library_borrowing.exception;

import com.skyfirst.library_borrowing.enums.ResultCode;
import lombok.Getter;

/**
 * 通用业务异常
 */
@Getter
public class BusinessException extends RuntimeException {
    private final Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message) {
        this(500, message);
    }

    public BusinessException(ResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMessage());
    }
}