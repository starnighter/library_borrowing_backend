package com.skyfirst.library_borrowing.vo;

import lombok.Builder;
import lombok.Data;

/**
 * 登录返回VO
 */
@Data
@Builder
public class LoginVO {
    private String token;
    private UserVO userInfo;
}
