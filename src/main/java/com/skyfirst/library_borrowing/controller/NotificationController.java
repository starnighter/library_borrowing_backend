package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.common.PageResponse;
import com.skyfirst.library_borrowing.dto.ReadNotificationsDTO;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.INotificationService;
import com.skyfirst.library_borrowing.vo.NotificationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 通知表 前端控制器
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private INotificationService notificationService;

    @GetMapping("/me")
    public ApiResponse<PageResponse<NotificationVO>> getNotifications(@RequestParam Long currentPage, @RequestParam Long pageSize){
        if (currentPage == null || pageSize == null){
            throw new BusinessException("传入的当前页码或每页大小为空，请重新传入");
        }

        List<NotificationVO> vo = notificationService.getNotifications(currentPage, pageSize);
        return ApiResponse.success(new PageResponse<>(currentPage, pageSize, vo));
    }

    @GetMapping("/unread-count")
    public ApiResponse<String> getUnreadCount(){
        String count = notificationService.getUnreadCount();
        return ApiResponse.success(count);
    }

    @PutMapping("/read")
    public ApiResponse<Void> readNotifications(@RequestBody ReadNotificationsDTO dto){
        if (dto == null || dto.getNotificationIdLIst() == null || dto.getNotificationIdLIst().isEmpty()){
            throw new BusinessException("传入的阅读通知数据或通知ID列表为空，请重新传入");
        }

        notificationService.readNotifications(dto);

        return ApiResponse.success();
    }
}
