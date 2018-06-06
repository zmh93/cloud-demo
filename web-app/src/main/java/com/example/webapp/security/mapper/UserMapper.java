package com.example.webapp.security.mapper;

import com.example.webapp.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends JpaRepository<User,Long> {

    User findByUsername(String username);
}