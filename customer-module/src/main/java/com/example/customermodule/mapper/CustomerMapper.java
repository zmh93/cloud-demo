package com.example.customermodule.mapper;

import com.example.customermodule.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper extends JpaRepository<Customer,Long> {
}
