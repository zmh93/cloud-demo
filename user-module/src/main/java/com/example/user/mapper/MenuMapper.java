package com.example.user.mapper;

import com.example.user.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuMapper extends JpaRepository<Menu,Long> {}