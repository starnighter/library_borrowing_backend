package com.skyfirst.library_borrowing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 图书表
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Getter
@Setter
@ToString
@TableName("book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID，采用雪花算法生成
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 书名
     */
    @TableField("title")
    private String title;

    /**
     * 作者
     */
    @TableField("author")
    private String author;

    /**
     * ISBN号
     */
    @TableField("isbn")
    private String isbn;

    /**
     * 出版社
     */
    @TableField("publisher")
    private String publisher;

    /**
     * 出版日期
     */
    @TableField("publish_date")
    private LocalDate publishDate;

    /**
     * 分类
     */
    @TableField("category")
    private String category;

    /**
     * 内容简介
     */
    @TableField("description")
    private String description;

    /**
     * 封面图片URL
     */
    @TableField("cover_url")
    private String coverUrl;

    /**
     * 总库存
     */
    @TableField("total_stock")
    private Integer totalStock;

    /**
     * 可用库存 (总库存 - 已借出)
     */
    @TableField("available_stock")
    private Integer availableStock;

    /**
     * 逻辑删除 0:未删除 1:已删除
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
