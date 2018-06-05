package com.example.common.api.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product-module")
public interface RProductService {
    @GetMapping("/allProduct")
    Object getAll();
}
