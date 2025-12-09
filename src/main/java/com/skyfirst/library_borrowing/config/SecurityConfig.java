package com.skyfirst.library_borrowing.config;

import com.skyfirst.library_borrowing.filter.JwtAuthenticationTokenFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @program: library_borrowing_backend
 * @description:
 * @author: bingxunqing
 * @create: 2025-12-08 22:56
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // 1. 关闭 CSRF (跨站请求伪造) 保护
                // 前后端分离项目中，因为我们使用 Token 认证，不需要 Session，所以通常关闭 CSRF
                .csrf(AbstractHttpConfigurer::disable)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // 2. 配置请求拦截规则
                .authorizeHttpRequests(auth -> auth
                        // Allow specific paths (Login, Register) without authentication
                        // 注意：这里要跟 Controller 路径匹配，比如 Controller 是 @RequestMapping("/user")
                        .requestMatchers("/user/login","/user/register").permitAll()

                        // Allow static resources (Swagger UI, etc. if you have them) - Optional
                        // .requestMatchers("/doc.html", "/webjars/**", "/v3/api-docs/**").permitAll()

                        // All other requests require authentication
                        // 除上面外的所有请求，都需要携带 Token 才能访问
                        .anyRequest().authenticated()
                ).addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
