package com.skyfirst.library_borrowing.util;

import com.skyfirst.library_borrowing.propertites.JwtProperties;
import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;

/**
 * @program: library_borrowing_backend
 * @description: jwt鉴权的工具类
 * @author: bingxunqing
 * @create: 2025-12-08 22:10
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class JwtUtils {
    private final JwtProperties jwtProperties;

    public String getTokenName() {
        return jwtProperties.getTokenName();
    }
    
    /**
     * @description: 生成 JWT 令牌
     * @author: bingxunqing
     * @date: 2025/12/8 22:25
     * @param claims 载荷数据 (比如用户ID, 用户名)
     * @return String 加密后的 Token
     */
    public  String generateJwt(Map<String, Object> claims) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        String secretKey = jwtProperties.getSecretKey();
        long expiration = jwtProperties.getExpiration();
        long expMillis = System.currentTimeMillis() + expiration;
        Date exp = new Date(expMillis);

        return Jwts.builder()
                .setClaims(claims)
                .signWith(signatureAlgorithm,secretKey.getBytes(StandardCharsets.UTF_8))
                .setExpiration(exp)
                .compact();
    }

    /**
     * @description: 解析 JWT 令牌
     * @author: bingxunqing
     * @date: 2025/12/8 22:25
     * @param token 前端传来的 Token 字符串
     *  @return Claims 解析后的数据对象
     */
    public Claims parseJwt(String token) {

        String secretKey = jwtProperties.getSecretKey();
        try{
            return Jwts.parser()
                    .setSigningKey(secretKey.getBytes(StandardCharsets.UTF_8))
                    .parseClaimsJws(token)
                    .getBody();
        } catch (ExpiredJwtException e) {
            log.error("JWT 令牌已过期: {}", e.getMessage());
            throw new RuntimeException("登录状态已过期，请重新登录");
        } catch (MalformedJwtException e) {
            log.error("JWT 令牌格式错误: {}", e.getMessage());
            throw new RuntimeException("非法令牌");
        } catch (Exception e) {
            log.error("JWT 解析失败: {}", e.getMessage());
            throw new RuntimeException("用户未登录或令牌无效");
        }
    }

}
