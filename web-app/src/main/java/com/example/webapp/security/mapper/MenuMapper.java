package com.example.webapp.security.mapper;

import com.example.webapp.security.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuMapper extends JpaRepository<Menu,Long> {}