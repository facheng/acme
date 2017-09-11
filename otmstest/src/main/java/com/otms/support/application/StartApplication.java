package com.otms.support.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by bert on 17-8-31.
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.otms.support")
@ImportResource("classpath:META-INF/spring/applicationContext*.xml")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
