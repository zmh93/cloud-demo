package com.example.usermodule.mapper;

import com.example.usermodule.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserMapper  extends JpaRepository<User,Long> {
}
