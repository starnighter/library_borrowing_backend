package com.skyfirst.library_borrowing.dto;

import lombok.Data;

/**
 * 图书借阅请求DTO
 */
@Data
public class BorrowRequestDTO {
    private String bookId;// 要借阅的图书ID
    private Integer borrowTime;
    // 借阅的时间，只能选以下值
    // 一天，三天，一星期，两星期，一个月，两个月，三个月
    // 前端传入的全部是换算过后的天数
    // 1，3，7，14，30，60，90
}