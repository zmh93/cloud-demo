package com.example.common.api.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("customer-module")
public interface RCustomerService {

    @GetMapping("/allUser")
    Object getAll();

    @GetMapping("/getLoginUser")
    Object getLoginUser();
}
