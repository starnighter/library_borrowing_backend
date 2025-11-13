package com.skyfirst.library_borrowing.vo;

import lombok.Data;

/**
 * 登录返回VO
 */
@Data
public class LoginVO {
    private String token;
    private UserVO userInfo;
}
