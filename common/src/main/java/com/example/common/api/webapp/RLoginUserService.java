package com.example.common.api.webapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("web-app")
public interface RLoginUserService {

    @GetMapping("/getUsername")
    Object getUsername();
}
