package com.example.common.service.impl;

import com.example.common.api.product.RProductService;
import com.example.common.entity.Product;
import com.example.common.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductService implements RProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll() {
        return productMapper.findAll();
    }
}
