package com.example.user.mapper;

import com.example.user.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends JpaRepository<Role,Long> {
}