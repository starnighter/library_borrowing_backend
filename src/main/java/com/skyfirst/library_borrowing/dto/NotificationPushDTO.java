package com.skyfirst.library_borrowing.dto;

import lombok.Data;

@Data
public class NotificationPushDTO {
    private String title;
    private String content;
    // COMMON, DUE_REMINDER, OVERDUE_NOTICE
    // 常规通知，借阅到期还书提醒，借阅过期提醒
    private String type;
    private String status; // UNREAD, READ
}
