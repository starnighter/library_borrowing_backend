package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 预约信息VO，分页返回
 */
@Data
public class ReservationVO {
    private String id; // 预约记录ID
    private String bookId;
    private String bookTitle; // 书名
    private String bookAuthor; // 作者
    private LocalDateTime reservationDate; // 预约时间
    private String status; // PENDING, AVAILABLE, FULFILLED, CANCELLED
    // 等待中，可获取，已满足，已取消
}