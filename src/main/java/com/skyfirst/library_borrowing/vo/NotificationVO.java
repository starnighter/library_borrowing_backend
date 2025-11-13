package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 通知信息VO，分页返回
 */
@Data
public class NotificationVO {
    private String id;
    private String title;
    private String content;
    private String type; // DUE_REMINDER, RESERVATION_AVAILABLE, OVERDUE_NOTICE
    private String status; // UNREAD, READ
    private LocalDateTime gmtCreate; // 通知创建时间
}