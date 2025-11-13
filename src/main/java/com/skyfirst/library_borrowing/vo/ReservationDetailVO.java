package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 管理端查看的详细预约信息，包含userId
 */
@Data
public class ReservationDetailVO {
    private String id; // 预约记录ID
    private String userId;
    private String bookId;
    private String bookTitle; // 书名
    private String bookAuthor; // 作者
    private LocalDateTime reservationDate; // 预约时间
    private String status; // PENDING, AVAILABLE, FULFILLED, CANCELLED
    // 等待中，可获取，已满足，已取消
}
