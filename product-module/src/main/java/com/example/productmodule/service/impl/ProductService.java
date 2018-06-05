package com.example.productmodule.service.impl;

import com.example.common.api.product.RProductService;
import com.example.productmodule.entity.Product;
import com.example.productmodule.mapper.ProductMapper;
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
