package com.bane.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"com.bane"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                value = org.springframework.context.annotation.Configuration.class))
public class AppConfig {
}
