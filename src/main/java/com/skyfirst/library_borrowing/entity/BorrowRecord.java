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
 * 借阅记录表
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Getter
@Setter
@ToString
@TableName("borrow_record")
public class BorrowRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID，采用雪花算法生成
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户ID (外键 lms_user.id)
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 图书ID (外键 lms_book.id)
     */
    @TableField("book_id")
    private Long bookId;

    /**
     * 借书日期
     */
    @TableField("borrow_date")
    private LocalDateTime borrowDate;

    /**
     * 应还日期
     */
    @TableField("due_date")
    private LocalDateTime dueDate;

    /**
     * 实际归还日期 (NULL表示未归还)
     */
    @TableField("return_date")
    private LocalDateTime returnDate;

    /**
     * 状态 (BORROWED, RETURNED, OVERDUE)
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
