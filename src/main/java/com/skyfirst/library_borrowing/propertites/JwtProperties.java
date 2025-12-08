package com.skyfirst.library_borrowing.propertites;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: library_borrowing_backend
 * @description: jwt配置类
 * @author: bingxunqing
 * @create: 2025-12-08 22:36
 */
@Data
@Component
@ConfigurationProperties(prefix = "skyfirst.jwt")
public class JwtProperties {
    /**
     * @description: 密钥
     * @author: bingxunqing
     * @date: 2025/12/8 22:38
     */
    private String secretKey;
    /**
     * @description: token有效时间
     * @author: bingxunqing
     * @date: 2025/12/8 22:38
     */
    private long expiration;
    /**
     * @description: token在header的字段名称
     * @author: bingxunqing
     * @date: 2025/12/8 22:39
     */
    private String tokenName;
}
