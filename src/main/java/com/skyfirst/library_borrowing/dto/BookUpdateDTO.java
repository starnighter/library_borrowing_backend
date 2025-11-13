package com.skyfirst.library_borrowing.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * 更新图书信息DTO
 */
@Data
public class BookUpdateDTO {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private LocalDate publishDate;
    private String category;
    private String description;
    private String coverUrl;
    private Integer totalStock; // 更新总库存
    // 注意：更新总库存时，后端需要重新计算 available_stock
}