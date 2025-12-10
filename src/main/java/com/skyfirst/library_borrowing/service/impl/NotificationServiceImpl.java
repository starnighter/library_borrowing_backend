package com.skyfirst.library_borrowing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skyfirst.library_borrowing.common.ResultCode;
import com.skyfirst.library_borrowing.common.context.BaseContext;
import com.skyfirst.library_borrowing.dto.NotificationPushDTO;
import com.skyfirst.library_borrowing.dto.ReadNotificationsDTO;
import com.skyfirst.library_borrowing.entity.Notification;
import com.skyfirst.library_borrowing.entity.User;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.mapper.NotificationMapper;
import com.skyfirst.library_borrowing.mapper.UserMapper;
import com.skyfirst.library_borrowing.service.INotificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyfirst.library_borrowing.vo.NotificationVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<NotificationVO> getNotifications(Long currentPage, Long pageSize) {
        Long userId = BaseContext.getCurrentId();
        Page<Notification> page = new Page<>(currentPage, pageSize);
        List<Notification> notifications = lambdaQuery().eq(Notification::getUserId, userId)
                .page(page)
                .getRecords();

        return notifications.stream()
                .map(this::notification2VO)
                .toList();
    }

    @Override
    public String getUnreadCount() {
        return lambdaQuery()
                .eq(Notification::getStatus, "UNREAD")
                .count()
                .toString();
    }

    @Override
    @Transactional
    public void readNotifications(ReadNotificationsDTO dto) {
        List<Long> idList = dto.getNotificationIdLIst().stream()
                .map(Long::parseLong)
                .toList();

        boolean success = lambdaUpdate().in(Notification::getId, idList)
                .set(Notification::getStatus, "READ")
                .update();

        if (!success) {
            throw new BusinessException("批量设置消息已阅读失败，请重试");
        }
    }

    @Override
    @Transactional
    public void pushNotification2All(NotificationPushDTO dto) {
        List<Notification> notifications = userMapper.selectList(null)
                .stream()
                .map(User::getId)
                .map(userId -> {
                    Notification notification = new Notification();
                    BeanUtils.copyProperties(dto, notification);
                    notification.setUserId(userId);
                    return notification;
                })
                .toList();

        if (!saveBatch(notifications)) {
            throw new BusinessException("推送通知给所有用户失败，请重试");
        }
    }

    @Override
    @Transactional
    public void pushNotification2User(String userName, NotificationPushDTO dto) {
        User user = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getUserName, userName));
        if (user == null) {
            throw new BusinessException(ResultCode.USER_NOT_EXIST.getCode(), "该用户不存在，无法推送通知");
        }
        Notification notification = new Notification();
        BeanUtils.copyProperties(dto, notification);
        notification.setUserId(user.getId());

        if (!save(notification)) {
            throw new BusinessException(String.format("推送通知给指定用户%s失败，请重试", userName));
        }
    }

    private NotificationVO notification2VO(Notification notification) {
        NotificationVO vo = new NotificationVO();
        BeanUtils.copyProperties(notification, vo);
        vo.setId(notification.getId().toString());
        return vo;
    }
}
