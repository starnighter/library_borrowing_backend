package com.skyfirst.library_borrowing.config;

import com.skyfirst.library_borrowing.filter.JwtAuthenticationTokenFilter;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * 安全配置类 - 修复403问题：新增跨域配置、异常处理、完善请求匹配
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // 1. 关闭CSRF（Token认证不需要）
                .csrf(AbstractHttpConfigurer::disable)
                // 2. 配置跨域（核心修复：解决OPTIONS预检请求403）
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
                // 3. 无状态会话（前后端分离）
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // 4. 异常处理（自定义认证/授权失败响应）
                .exceptionHandling(ex -> ex
                        // 认证失败（未登录/Token无效）返回401
                        .authenticationEntryPoint((request, response, authException) -> {
                            response.setContentType("application/json;charset=UTF-8");
                            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                            response.getWriter().write("{\"code\":401,\"msg\":\"未认证，请先登录\"}");
                        })
                        // 授权失败（无权限）返回403
                        .accessDeniedHandler((request, response, accessDeniedException) -> {
                            response.setContentType("application/json;charset=UTF-8");
                            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
                            response.getWriter().write("{\"code\":403,\"msg\":\"无访问权限\"}");
                        })
                )
                // 5. 请求授权规则（精准匹配，避免路径匹配问题）
                .authorizeHttpRequests(auth -> auth
                        // 放行登录/注册接口
                        .requestMatchers("/user/login", "/user/register").permitAll()
                        // 可选：放行Swagger文档（如果有）
                        // .requestMatchers("/doc.html", "/webjars/**", "/v3/api-docs/**", "/swagger-ui/**").permitAll()
                        // 可选：放行静态资源
                        // .requestMatchers("/static/**", "/images/**").permitAll()
                        // 所有其他请求需要认证
                        .anyRequest().authenticated()
                )
                // 6. 添加JWT过滤器（在用户名密码认证过滤器之前）
                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    /**
     * 跨域配置源（解决跨域请求403）
     */
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        // 允许所有源（生产环境建议指定具体域名）
        config.addAllowedOriginPattern("*");
        // 允许所有请求方法
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        // 允许所有请求头
        config.addAllowedHeader("*");
        // 允许携带Cookie（如果需要）
        config.setAllowCredentials(true);
        // 预检请求缓存时间（秒）
        config.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 所有路径应用跨域配置
        source.registerCorsConfiguration("/**", config);
        return source;
    }
}