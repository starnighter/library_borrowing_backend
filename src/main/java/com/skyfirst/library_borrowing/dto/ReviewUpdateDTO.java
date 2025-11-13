package com.skyfirst.library_borrowing.dto;

import lombok.Data;

/**
 * 更新评价DTO
 */
@Data
public class ReviewUpdateDTO {
    private Double rating; // 1-5 星
    private String comment; // 评价内容
}