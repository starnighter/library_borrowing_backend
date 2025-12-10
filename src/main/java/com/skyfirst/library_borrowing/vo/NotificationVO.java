package com.skyfirst.library_borrowing.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 通知信息VO，分页返回
 */
@Data
public class NotificationVO {
    // 对比 notification 表字段无 userId
    private String id;
    private String title;
    private String content;
    // COMMON, DUE_REMINDER, OVERDUE_NOTICE
    // 常规通知，借阅到期还书提醒，借阅过期提醒
    private String type;
    private String status; // UNREAD, READ
    private LocalDateTime gmtCreate; // 通知创建时间
}