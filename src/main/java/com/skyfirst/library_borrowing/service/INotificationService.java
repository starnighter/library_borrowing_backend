package com.skyfirst.library_borrowing.service;

import com.skyfirst.library_borrowing.dto.NotificationPushDTO;
import com.skyfirst.library_borrowing.dto.ReadNotificationsDTO;
import com.skyfirst.library_borrowing.entity.Notification;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skyfirst.library_borrowing.vo.NotificationVO;

import java.util.List;

/**
 * <p>
 * 通知表 服务类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
public interface INotificationService extends IService<Notification> {

    List<NotificationVO> getNotifications(Long currentPage, Long pageSize);

    String getUnreadCount();

    void readNotifications(ReadNotificationsDTO dto);

    void pushNotification2All(NotificationPushDTO dto);

    void pushNotification2User(String userName, NotificationPushDTO dto);
}
