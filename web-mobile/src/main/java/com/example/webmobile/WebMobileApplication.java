package com.example.webmobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.common")
@EnableEurekaClient
public class WebMobileApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebMobileApplication.class, args);
    }
}
