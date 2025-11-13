package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDate;

/**
 * 馆藏图书详情VO，整合了书籍的评分
 */
@Data
public class BookDetailVO {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private LocalDate publishDate;
    private String category;
    private String description;
    private String coverUrl;
    private Integer totalStock;
    private Integer availableStock;
    // 图书的平均分
    private Double averageRating;
}