package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 评价信息VO，分页返回
 */
@Data
public class ReviewVO {
    private String id; // 评价ID
    private String bookId;
    private String userId;
    private String username; // 用户名
    private Double rating;
    private String comment;
    private LocalDateTime gmtCreate; // 评价时间
}