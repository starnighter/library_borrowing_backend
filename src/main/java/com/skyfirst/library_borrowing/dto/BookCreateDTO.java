package com.skyfirst.library_borrowing.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * 图书创建DTO
 */
@Data
public class BookCreateDTO {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private LocalDate publishDate;
    private String category;
    private String description;
    private String coverUrl;
    private Integer totalStock; // 初始总库存
    // available_stock 后端应自动设为 = totalStock
}
