package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.example.app",
        "com.example.core",
        "com.example.security",
        "com.example.biz"
})
@Import({
        com.example.core.config.CoreConfig.class,
        com.example.security.config.SecurityConfig.class
})
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
} 