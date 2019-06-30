package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private static ConfigurableApplicationContext application;

    public static void main(String[] args) {
        application = SpringApplication.run(DemoApplication.class, args);
    }
}
