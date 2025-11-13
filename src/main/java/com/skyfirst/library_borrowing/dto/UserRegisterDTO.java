package com.skyfirst.library_borrowing.dto;

import lombok.Data;

/**
 * 用户注册DTO
 */
@Data
public class UserRegisterDTO {
    private String username;
    private String password;
    private String email;
}
