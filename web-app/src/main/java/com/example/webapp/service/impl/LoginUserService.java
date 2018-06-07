package com.example.webapp.service.impl;

import com.example.common.api.webapp.RLoginUserService;
import com.example.webapp.security.domain.User;
import com.example.webapp.security.mapper.UserMapper;
import com.example.webapp.security.util.LoginUserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginUserService implements RLoginUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUsername() {
        return userMapper.findByUsername(LoginUserContext.getUsername());
    }
}
