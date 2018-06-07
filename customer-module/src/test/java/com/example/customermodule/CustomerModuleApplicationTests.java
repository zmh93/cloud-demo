package com.example.customermodule;

import com.example.customermodule.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerModuleApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void contextLoads() {
        customerMapper.findAll().forEach(System.out::println);
    }

}
