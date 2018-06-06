package com.example.webapp.security.mapper;

import com.example.webapp.security.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends JpaRepository<Role,Long> {
}