package com.skyfirst.library_borrowing.common;

import com.skyfirst.library_borrowing.enums.ResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一响应类
 */
@Data
public class ApiResponse<T> implements Serializable {

    private Integer code;
    private String msg ="请求成功";
    private T data;

    // 含有数据的成功响应类型
    public static <T> ApiResponse<T> success(T data){
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(0);
        response.setData(data);
        return response;
    }

    // 不含有数据的成功响应类型
    public static <T> ApiResponse<T> success(){
        return success(null);
    }

    // 含有消息与数据的成功响应类型
    public static <T> ApiResponse<T> success(String message, T data){
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(200);
        response.setMsg(message);
        response.setData(data);
        return response;
    }

    // 含有消息不含数据的成功响应类型
    public static <T> ApiResponse<T> success(String message){
        return success(message, null);
    }

    // 失败时的响应类型
    public static <T> ApiResponse<T> error(Integer code,String msg){
        ApiResponse<T> response=new ApiResponse<>();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }

    // 含有状态码枚举的失败类型
    public static <T> ApiResponse<T> error(ResultCode resultCode){
        return error(resultCode.getCode(), resultCode.getMessage());
    }
}