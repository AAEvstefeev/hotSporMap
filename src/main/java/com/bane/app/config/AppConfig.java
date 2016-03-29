package com.bane.app.config;

import mkyong.config.SecurityConfig;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


//@ComponentScan({ "com.mkyong.web.*" })
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.bane"}, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = org.springframework.context.annotation.Configuration.class))
//@Import({ SecurityConfig.class })
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

}
