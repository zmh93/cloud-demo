package com.example.user.web;

import com.example.user.entity.User;
import com.example.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserControlleer {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index() {
        return "请输入您的账号，密码";
    }

    @GetMapping("/getAll")
    public Object getAll() {
        return userMapper.findAll();
    }

    @GetMapping("/login/{username}/{password}")
    public Object login(@PathVariable("username") String username, @PathVariable("password") String password) {
        Map<Object, Object> resultMap = new HashMap<>();
        User                user      = userMapper.findByUsername(username);
        resultMap.put("code", user != null && user.getPassword().equals(password));
        /**
         * todo 模拟生成token并将用户数据放入redis(未集成)
         */
        resultMap.put("token", "123");

        return resultMap;
    }
}
