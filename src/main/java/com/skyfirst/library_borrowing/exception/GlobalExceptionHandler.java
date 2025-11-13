package com.skyfirst.library_borrowing.exception;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.enums.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    // 处理业务异常
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResponseEntity<ApiResponse<Object>> handleBusinessException(BusinessException e) {
        log.error("业务异常：{}", e.getMessage());
        ApiResponse<Object> error = ApiResponse.error(e.getCode(), e.getMessage());
        return new ResponseEntity<>(error, HttpStatusCode.valueOf(error.getCode()));
    }

    // 处理参数校验异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<ApiResponse<Object>> handleValidException(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        log.error("参数校验异常：{}", message);
        ApiResponse<Object> error = ApiResponse.error(400, message);
        return new ResponseEntity<>(error, HttpStatusCode.valueOf(error.getCode()));
    }

    // 处理其他未知异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ApiResponse<Object>> handleException(Exception e) {
        log.error("其他异常：", e);
        ApiResponse<Object> error = ApiResponse.error(ResultCode.FAIL.getCode(), "系统繁忙，请稍后再试");
        return new ResponseEntity<>(error, HttpStatusCode.valueOf(error.getCode()));
    }
}