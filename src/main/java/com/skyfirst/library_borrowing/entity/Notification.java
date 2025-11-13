package com.skyfirst.library_borrowing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 通知表
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Getter
@Setter
@ToString
@TableName("notification")
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 接收通知的用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 通知标题
     */
    @TableField("title")
    private String title;

    /**
     * 通知内容
     */
    @TableField("content")
    private String content;

    /**
     * 通知类型 (DUE_REMINDER, RESERVATION_AVAILABLE, OVERDUE_NOTICE)
     */
    @TableField("type")
    private String type;

    /**
     * 状态 (UNREAD, READ)
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;
}
