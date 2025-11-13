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
 * 评价表
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Getter
@Setter
@ToString
@TableName("review")
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
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
     * 评分 (1-5星)
     */
    @TableField("rating")
    private Double rating;

    /**
     * 评价内容
     */
    @TableField("comment")
    private String comment;

    /**
     * 逻辑删除 0:未删除 1:已删除 (管理员审核)
     */
    @TableField("is_deleted")
    private Boolean isDeleted;

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
