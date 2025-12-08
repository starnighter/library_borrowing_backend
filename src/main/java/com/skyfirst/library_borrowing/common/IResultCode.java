package com.skyfirst.library_borrowing.common;

/**
 * @describe: 状态码接口
 *  所有枚举类都应该实现该接口
 * @program: library_borrowing_backend
 * @description:
 * @author: bingxunqing
 * @create: 2025-12-08 23:16
 */

public interface IResultCode {
    Integer getCode();
    String getMessage();
}