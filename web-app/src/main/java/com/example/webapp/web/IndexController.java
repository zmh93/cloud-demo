package com.example.webapp.web;

import com.example.common.api.product.RProductService;
import com.example.common.api.user.RUserService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private RProductService productService;
    @Autowired
    private RUserService userService;

    @GetMapping("/getAllProduct")
    public Object getAllProduct() {
        return productService.getAll();
    }

    @GetMapping("/getAllUser")
    public Object getAllUser(){
        return userService.getAll();
    }
}
