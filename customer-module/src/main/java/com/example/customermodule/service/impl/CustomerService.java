package com.example.customermodule.service.impl;

import com.example.common.api.customer.RCustomerService;
import com.example.customermodule.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService implements RCustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Object getAll() {
        return customerMapper.findAll();
    }

}
