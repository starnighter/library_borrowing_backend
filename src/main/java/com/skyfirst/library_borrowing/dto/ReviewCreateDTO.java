package com.skyfirst.library_borrowing.dto;

import lombok.Data;

/**
 * 创建评价DTO
 */
@Data
public class ReviewCreateDTO {
    private String bookId; // 评价哪本书
    private Double rating; // 1-5 星
    private String comment; // 评价内容
}