package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 借阅记录VO，可用于用户当前借阅（BORROWED，OVERDUE）列表以及历史借阅（RETURNED）列表
 * 分页返回
 */
@Data
public class BorrowRecordVO {
    // 补充书名和封面图片
    private String id; // 借阅记录ID
    private String bookId; // 图书ID
    private String bookTitle; // 书名
    private String bookCoverUrl; // 封面图片url
    private LocalDateTime borrowDate; // 借阅日期
    private LocalDateTime dueDate; // 应还日期
    private LocalDateTime returnDate; // 实际归还日期 (未归还则为null)
    private String status; // BORROWED, RETURNED, OVERDUE（已借阅，已归还，超出归还时间）
}