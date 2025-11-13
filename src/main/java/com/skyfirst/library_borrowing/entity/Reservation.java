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
 * 图书预约表
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Getter
@Setter
@ToString
@TableName("reservation")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID，采用雪花算法生成
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 图书ID
     */
    @TableField("book_id")
    private Long bookId;

    /**
     * 预约日期
     */
    @TableField("reservation_date")
    private LocalDateTime reservationDate;

    /**
     * 状态 (PENDING, AVAILABLE, FULFILLED, CANCELLED)
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @TableField("gmt_modified")
    private LocalDateTime gmtModified;
}
