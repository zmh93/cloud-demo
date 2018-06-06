package com.example.webapp;

import com.example.webapp.security.mapper.RoleMapper;
import com.example.webapp.security.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebAppApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void contextLoads() {
        roleMapper.findAll();
        System.out.println(userMapper.findByUsername("admin"));
    }

}
