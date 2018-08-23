package com.atguigu.shizhan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com.atguigu.shizhan")
public class ShizhanWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShizhanWebApplication.class, args);
    }
}
