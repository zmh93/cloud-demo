package com.example.webapp.security;

import com.example.webapp.security.domain.Role;
import com.example.webapp.security.domain.User;
import com.example.webapp.security.mapper.UserMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Component
public class MyUserDetailService implements UserDetailsService {
    @Resource
    private UserMapper userMapper;

    /**
     * 数据库交互获取用户拥有的权限角色，并设置权限
     */
    @Override
    public UserDetails loadUserByUsername(String userCode) throws UsernameNotFoundException {
        // 根据登录用户名获取用户信息
        User user = new User();
        user = userMapper.findByUsername(userCode);
        if (null != user) {
            // 存放权限
            Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
            Set<Role>                    roles = user.getRoles();
            if (roles.size()>0) {
                for (Role role : roles) {
                    SimpleGrantedAuthority auth = new SimpleGrantedAuthority(role.getRoleName());
                    auths.add(auth);
                }
            }
            //spring security自带的User对象
            org.springframework.security.core.userdetails.User userDetails = new org.springframework.security.core.userdetails.User(userCode, user.getPassword(), true, true, true, true, auths);
            return userDetails;
        }
        return null;
    }
}