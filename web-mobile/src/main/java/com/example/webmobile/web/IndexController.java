package com.example.webmobile.web;

import com.example.common.api.customer.RCustomerService;
import com.example.common.api.product.RProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {

    @Autowired
    private RProductService  productService;
    @Autowired
    private RCustomerService customerService;


    @GetMapping("/getAllProduct")
    public Object getAllProduct() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("mobile_data", productService.getAll());
        return map;
    }

    @GetMapping("/getAllUser")
    public Object getAllUser(){
        return customerService.getAll();
    }


}
