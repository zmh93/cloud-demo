package com.example.webapp.web;

import com.example.common.api.product.RProductService;
import com.example.common.api.customer.RCustomerService;
import com.example.webapp.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private RProductService  productService;
    @Autowired
    private RCustomerService customerService;
    @Autowired
    private UserMapper       userMapper;

    @GetMapping("/getAllProduct")
    public Object getAllProduct() {
        return productService.getAll();
    }

    @GetMapping("/getAllUser")
    public Object getAllUser(){
        return customerService.getAll();
    }

    @GetMapping("/testUser")
    public Object testUserMapper() {
        return userMapper.findAll();
    }

    @GetMapping("/getLoginUser")
    public Object getLoginUser(){
        return customerService.getLoginUser();
    }

}
