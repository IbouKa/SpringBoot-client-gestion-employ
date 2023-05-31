package com.manager.demomanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.manager.demomanager")
public class CustomProperties {
    private String apiUrl;
}
