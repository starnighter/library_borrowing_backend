package com.skyfirst.library_borrowing.common;

import lombok.Data;
import java.io.Serializable;

/**
 * @description: 通用返回结果封装类,每个controller 应该返回的时候直接使用R.success 或者R.failed(IResultCode)
 * @author: bingxunqing
 * @date: 2025/12/8 23:22
 */
@Data
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private T data;
    // 时间戳，方便排查问题
    private long timestamp;

    // 私有构造器，强制使用静态方法
    private ApiResponse() {
        this.timestamp = System.currentTimeMillis();
    }

    private ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * 成功返回结果
     */
    public static <T> ApiResponse<T> success() {
        return success(null);
    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     */
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果（自定义提示信息）
     * @param data 获取的数据
     * @param message 提示信息
     */
    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码枚举
     */
    public static <T> ApiResponse<T> failed(IResultCode errorCode) {
        return new ApiResponse<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果（自定义提示信息）
     * @param message 错误信息
     */
    public static <T> ApiResponse<T> failed(String message) {
        return new ApiResponse<>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果（自定义错误码和信息）
     */
    public static <T> ApiResponse<T> failed(Integer code, String message) {
        return new ApiResponse<>(code, message, null);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> ApiResponse<T> validateFailed(String message) {
        return new ApiResponse<>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }
}