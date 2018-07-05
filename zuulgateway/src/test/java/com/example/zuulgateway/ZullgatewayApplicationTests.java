package com.example.zuulgateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZullgatewayApplicationTests {

    @Test
    public void contextLoads() {
        String testy = "/app/login/admin/123";
        System.out.println(Arrays.toString(testy.split("/")));
    }

}
