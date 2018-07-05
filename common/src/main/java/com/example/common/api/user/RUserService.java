package com.example.common.api.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user-module")
public interface RUserService {
    @GetMapping("/getAllUser")
    Object getAll();
}