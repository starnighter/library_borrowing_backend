package com.skyfirst.library_borrowing.propertites;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "skyfirst.db")
public class DBProperties {
    private String dbName;
}
