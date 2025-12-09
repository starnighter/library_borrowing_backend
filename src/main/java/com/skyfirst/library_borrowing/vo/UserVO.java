package com.skyfirst.library_borrowing.vo;

import lombok.Builder;
import lombok.Data;

/**
 * 用户详情VO
 */
@Data
@Builder
public class UserVO {
    // 所有id字段在实体类中均为Long类型
    // 为防止前端接收出错，所有id全部采用String类型返回给前端
    private String id;
    private String username;
    private String email;
    private String role;
}
