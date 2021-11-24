package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {
    private String rice;
    private String meat;
    private String[] sauce;
}
