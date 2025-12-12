package com.skyfirst.library_borrowing.dto;

import lombok.Data;

import java.util.List;

/**
 * 批量设置已读通知DTO
 */
@Data
public class ReadNotificationsDTO {
    private List<String> notificationIdList;
}
