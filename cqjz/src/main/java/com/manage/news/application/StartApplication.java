package com.manage.news.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = "com.manage.news")
@ImportResource({"classpath:META-INF/spring/applicationContext*.xml"})
public class StartApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class, args);

//        ActivitiTestService activitiTestService = SpringUtils.getBeanByClass(ActivitiTestService.class);
//        activitiTestService.monthtest();
    }
}