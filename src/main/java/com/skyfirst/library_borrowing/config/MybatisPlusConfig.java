package com.skyfirst.library_borrowing.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.skyfirst.library_borrowing.propertites.DBProperties;
import com.skyfirst.library_borrowing.util.SnowflakeIdGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@MapperScan(basePackages = "com.skyfirst.library_borrowing.mapper")
@RequiredArgsConstructor
public class MybatisPlusConfig {

    // 根据配置文件动态获取当前数据库信息
    private final DBProperties dbProperties;

    @Autowired
    private SnowflakeIdGenerator snowflakeIdGenerator;

    // 配置自己写的雪花算法ID生成器
    @Bean
    public IdentifierGenerator identifierGenerator() {
        return new MySnowflakeIdGenerator(snowflakeIdGenerator);
    }

    public static class MySnowflakeIdGenerator implements IdentifierGenerator {

        private final SnowflakeIdGenerator snowflakeIdGenerator;

        public MySnowflakeIdGenerator(SnowflakeIdGenerator snowflakeIdGenerator) {
            this.snowflakeIdGenerator = snowflakeIdGenerator;
        }

        @Override
        public Long nextId(Object entity) {
            return snowflakeIdGenerator.nextId();
        }
    }

    // 配置分页插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        PaginationInnerInterceptor paginationInnerInterceptor = null;
        if ("mysql".equals(dbProperties.getDbName())) {
            paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        } else if ("mariadb".equals(dbProperties.getDbName())) {
            paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MARIADB);
        } else {
            log.error("未配置数据库名称，请检查application-local.properties文件");
        }

        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }
}
