package com.skyfirst.library_borrowing.vo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @program: library_borrowing_backend
 * @description:
 * @author: bingxunqing
 * @create: 2025-12-08 23:35
 */
@Data
@Builder
public class RegisterVO {
    private String id;
    private String userName;
    private LocalDateTime createTime;
    private String email;
    private String role;
}
