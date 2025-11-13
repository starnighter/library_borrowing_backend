package com.skyfirst.library_borrowing.service.impl;

import com.skyfirst.library_borrowing.entity.Notification;
import com.skyfirst.library_borrowing.mapper.NotificationMapper;
import com.skyfirst.library_borrowing.service.INotificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
public class NotificationServiceImpl extends ServiceImpl<NotificationMapper, Notification> implements INotificationService {

}
