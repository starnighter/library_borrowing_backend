package com.skyfirst.library_borrowing.exception;

import com.skyfirst.library_borrowing.common.R;
import com.skyfirst.library_borrowing.common.ResultCode;
import lombok.extern.slf4j.Slf4j;
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
    public R<Object> handleBusinessException(BusinessException e) {
        log.error("业务异常 code={}, msg={}", e.getCode(), e.getMessage());
        // 直接返回业务异常中设定的 code 和 message
        return R.failed(e.getCode(), e.getMessage());
    }

    /**
     * @description: 处理参数校验异常 (Spring Validation)
     *       比如 @NotNull, @Size 等校验失败时抛出
     * @author: bingxunqing
     * @date: 2025/12/8 23:27
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R<Object> handleValidException(MethodArgumentNotValidException e) {
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
        // 使用 R 类中专门的参数校验失败方法
        return R.validateFailed(message);
    }

    /**
     * @description: 处理所有未知的系统异常
     *       比如空指针、数据库连接失败等
     * @author: bingxunqing
     * @date: 2025/12/8 23:28
     */
    @ExceptionHandler(Exception.class)
    public R<Object> handleException(Exception e) {
        log.error("系统未知异常：", e);
        // 统一返回 500 操作失败，隐藏具体的报错堆栈，防止泄露系统信息
        return R.failed(ResultCode.FAILED);
    }
}