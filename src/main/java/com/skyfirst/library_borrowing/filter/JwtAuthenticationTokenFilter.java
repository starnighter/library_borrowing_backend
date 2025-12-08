package com.skyfirst.library_borrowing.filter;

import com.skyfirst.library_borrowing.common.context.BaseContext;
import com.skyfirst.library_borrowing.util.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

/**
 * @description: JWT认证过滤器
 *  每次请求都会经过这里，校验 Token 并提取用户信息
 * @author: bingxunqing
 * @date: 2025/12/8 23:55
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    private final JwtUtils jwtUtils;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        // 获取Token
        // 使用 jwtUtils.getTokenName() 获取配置的 Header 名字
        String token = request.getHeader(jwtUtils.getTokenName());
        log.info(">>>>>> 目前配置的Header名: {}", jwtUtils.getTokenName());
        log.info(">>>>>> 实际拦截到的Token内容: [{}]", token);
        // 如果没有Token，直接放行
        // (Spring Security 会在后面拦截需要权限的接口，公共接口则会通过)
        if (!StringUtils.hasText(token) || !token.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        token = token.trim();

        try {
            // 解析Token
            // 如果解析失败，Utils 会抛出 RuntimeException，会被下面的 catch 捕获
            Claims claims = jwtUtils.parseJwt(token);

            // 获取用户ID
            // 存进去的时候通常是Integer或Long，取出来转String再转Long最稳妥
            Object userIdObj = claims.get("userId");
            if (userIdObj != null) {
                int userId = Integer.valueOf(userIdObj.toString());

                // Spring Security 用户已登录
                // 第三个参数是权限列表，目前给空列表
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(userId, null, Collections.emptyList());
                SecurityContextHolder.getContext().setAuthentication(authentication);

                // 存入 BaseContext，方便 Service 业务代码使用
                BaseContext.setCurrentId(userId);

                log.debug("JWT校验通过，用户ID: {}", userId);
            }
        } catch (Exception e) {
            // 遇到错误（过期、格式不对等）
            // 这里的策略是：记录日志，但不直接报错给前端，而是清理上下文
            // 这样 Spring Security 发现没有认证信息，会自动处理 401 响应
            log.error("Token认证失败: {}", e.getMessage());
            SecurityContextHolder.clearContext();
            BaseContext.removeCurrentId();
        }

        // 继续过滤器链
        filterChain.doFilter(request, response);

        // 请求结束后清理 ThreadLocal
        BaseContext.removeCurrentId();
    }
}