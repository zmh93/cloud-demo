package com.example.usermodule.service.impl;

import com.example.common.api.user.RUserService;
import com.example.usermodule.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService implements RUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Object getAll() {
        return userMapper.findAll();
    }
}
