package com.example.customermodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.common.api")
@EnableEurekaClient
public class CustomerModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerModuleApplication.class, args);
    }
}
