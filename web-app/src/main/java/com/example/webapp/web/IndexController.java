package com.example.webapp.web;

import com.example.common.api.product.RProductService;
import com.example.common.api.user.RUserService;
import com.example.common.util.AjaxResult;
import com.example.webapp.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private RProductService productService;
    @Autowired
    private RUserService    userService;
    @Autowired
    private UserMapper      userMapper;

    @GetMapping("/getAllProduct")
    public Object getAllProduct() {
        return productService.getAll();
    }

    @GetMapping("/getAllUser")
    public Object getAllUser(){
        return userService.getAll();
    }

    @GetMapping("/testUser")
    public Object testUserMapper() {
        return userMapper.findAll();
    }
}
