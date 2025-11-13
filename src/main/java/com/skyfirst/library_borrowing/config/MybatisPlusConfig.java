package com.skyfirst.library_borrowing.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.skyfirst.library_borrowing.util.SnowflakeIdGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.skyfirst.library_borrowing.mapper")
public class MybatisPlusConfig {

    @Autowired
    private SnowflakeIdGenerator snowflakeIdGenerator;

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
}
