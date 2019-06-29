package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DemoApplication {

    private static ConfigurableApplicationContext application;

    public static void main(String[] args) {
        application = SpringApplication.run(DemoApplication.class, args);
    }
}
