package com.example.productmodule;

import com.example.productmodule.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.rmi.PortableRemoteObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductModuleApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void contextLoads() {
        productMapper.findAll().forEach(System.out::println);
    }

}
