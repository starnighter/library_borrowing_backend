-- 1. 用户表 (user)
-- 存储用户和管理员信息
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                            `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                            `username` VARCHAR(50) NOT NULL COMMENT '用户名',
                            `password` VARCHAR(255) NOT NULL COMMENT '密码 (BCrypt加密)',
                            `email` VARCHAR(100) DEFAULT NULL COMMENT '电子邮箱',
                            `role` VARCHAR(20) NOT NULL DEFAULT 'user' COMMENT '角色 (user, admin)',
                            `is_deleted` TINYINT(1) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
                            `gmt_create` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `gmt_modified` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `uk_username` (`username`),
                            UNIQUE KEY `uk_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';


-- 2. 图书表 (book)
-- 存储图书馆藏信息
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
                            `id` BIGINT(20) NOT NULL COMMENT '主键ID',
                            `title` VARCHAR(255) NOT NULL COMMENT '书名',
                            `author` VARCHAR(100) DEFAULT NULL COMMENT '作者',
                            `isbn` VARCHAR(20) NOT NULL COMMENT 'ISBN号',
                            `publisher` VARCHAR(100) DEFAULT NULL COMMENT '出版社',
                            `publish_date` DATE DEFAULT NULL COMMENT '出版日期',
                            `category` VARCHAR(50) DEFAULT NULL COMMENT '分类',
                            `description` TEXT COMMENT '内容简介',
                            `cover_url` VARCHAR(255) DEFAULT NULL COMMENT '封面图片URL',
                            `total_stock` INT(11) NOT NULL DEFAULT 0 COMMENT '总库存',
                            `available_stock` INT(11) NOT NULL DEFAULT 0 COMMENT '可用库存 (总库存 - 已借出)',
                            `is_deleted` TINYINT(1) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
                            `gmt_create` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `gmt_modified` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `uk_isbn` (`isbn`),
                            KEY `idx_title` (`title`),
                            KEY `idx_author` (`author`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='图书表';


-- 3. 借阅记录表 (borrow_record)
-- 存储用户的借书和还书记录
DROP TABLE IF EXISTS `borrow_record`;
CREATE TABLE `borrow_record` (
                                     `id` BIGINT(20) NOT NULL COMMENT '主键ID',
                                     `user_id` BIGINT(20) NOT NULL COMMENT '用户ID (外键 lms_user.id)',
                                     `book_id` BIGINT(20) NOT NULL COMMENT '图书ID (外键 lms_book.id)',
                                     `borrow_date` DATETIME NOT NULL COMMENT '借书日期',
                                     `due_date` DATETIME NOT NULL COMMENT '应还日期',
                                     `return_date` DATETIME DEFAULT NULL COMMENT '实际归还日期 (NULL表示未归还)',
                                     `status` VARCHAR(20) NOT NULL DEFAULT 'BORROWED' COMMENT '状态 (BORROWED, RETURNED, OVERDUE)',
                                     `gmt_create` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                     `gmt_modified` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                     PRIMARY KEY (`id`),
                                     KEY `idx_user_id` (`user_id`),
                                     KEY `idx_book_id` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='借阅记录表';


-- 4. 评价表 (review)
-- 存储用户对图书的评价和打分
DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
                              `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                              `user_id` BIGINT(20) NOT NULL COMMENT '用户ID',
                              `book_id` BIGINT(20) NOT NULL COMMENT '图书ID',
                              `rating` DOUBLE NOT NULL COMMENT '评分 (1-5星)',
                              `comment` TEXT COMMENT '评价内容',
                              `is_deleted` TINYINT(1) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除 (管理员审核)',
                              `gmt_create` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `gmt_modified` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                              PRIMARY KEY (`id`),
                              UNIQUE KEY `uk_user_book` (`user_id`, `book_id`) COMMENT '同一用户对同一本书只能评价一次'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评价表';


-- 5. 通知表 (notification)
-- 存储发送给用户的通知 (如还书提醒、预约到货)
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
                                    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                    `user_id` BIGINT(20) NOT NULL COMMENT '接收通知的用户ID',
                                    `title` VARCHAR(255) NOT NULL COMMENT '通知标题',
                                    `content` TEXT NOT NULL COMMENT '通知内容',
                                    `type` VARCHAR(30) NOT NULL DEFAULT 'COMMON' COMMENT '通知类型 (COMMON, DUE_REMINDER, OVERDUE_NOTICE)',
                                    `status` VARCHAR(20) NOT NULL DEFAULT 'UNREAD' COMMENT '状态 (UNREAD, READ)',
                                    `gmt_create` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                    PRIMARY KEY (`id`),
                                    KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='通知表';