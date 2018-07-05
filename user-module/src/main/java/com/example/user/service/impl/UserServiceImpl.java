package com.example.user.service.impl;

import com.example.common.api.user.RUserService;
import com.example.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements RUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Object getAll() {
        return userMapper.findAll();
    }
}
