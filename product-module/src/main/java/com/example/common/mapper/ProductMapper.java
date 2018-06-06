package com.example.common.mapper;

import com.example.common.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper extends  JpaRepository<Product,Long> {
    <S extends Product> List<S> save(Iterable<S> product);
}
