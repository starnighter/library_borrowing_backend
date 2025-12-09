package com.skyfirst.library_borrowing.exception;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.common.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description: 全局异常处理
 * @author: bingxunqing
 * @date: 2025/12/8 23:24
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * @description:    处理自定义业务异常
     *      比如：throw new BusinessException(ResultCode.PASSWORD_ERROR);
     * @author: bingxunqing
     * @date: 2025/12/8 23:27
     */
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ApiResponse<Object>> handleBusinessException(BusinessException e) {
        log.error("业务异常 code={}, msg={}", e.getCode(), e.getMessage());
        ApiResponse<Object> failed = ApiResponse.failed(e.getCode(), e.getMessage());
        return new ResponseEntity<>(failed, HttpStatusCode.valueOf(failed.getCode()));
    }

    /**
     * @description: 处理参数校验异常 (Spring Validation)
     *       比如 @NotNull, @Size 等校验失败时抛出
     * @author: bingxunqing
     * @date: 2025/12/8 23:27
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Object>> handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        // 获取第一条错误信息返回给前端
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getDefaultMessage();
            }
        }
        log.warn("参数校验异常：{}", message);
        // 使用 ApiResponse 类中专门的参数校验失败方法
        ApiResponse<Object> validated = ApiResponse.validateFailed(message);

        return new ResponseEntity<>(validated, HttpStatusCode.valueOf(validated.getCode()));
    }

    /**
     * @description: 处理所有未知的系统异常
     *       比如空指针、数据库连接失败等
     * @author: bingxunqing
     * @date: 2025/12/8 23:28
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleException(Exception e) {
        log.error("系统未知异常：", e);
        // 统一返回 500 操作失败，隐藏具体的报错堆栈，防止泄露系统信息
        ApiResponse<Object> failed = ApiResponse.failed(ResultCode.FAILED);
        return new ResponseEntity<>(failed, HttpStatusCode.valueOf(failed.getCode()));
    }
}