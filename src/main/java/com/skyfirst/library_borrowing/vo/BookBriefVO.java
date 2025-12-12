package com.skyfirst.library_borrowing.vo;

import lombok.Data;

/**
 * 图书简略信息，可用于展示分页书籍列表中单个书籍元素
 */
@Data
public class BookBriefVO {
    private String id;
    private String title;
    private String publisher;
    private String author;
    private String category;
    private String coverUrl;
    private Integer totalStock;
    private Integer availableStock; // 显示可用库存
}