package com.example.customermanagement.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ITCustomerServiceTest {
    @Resource
    TCustomerService itCustomerService;
    @Test
    public void selectBycid(){
    }
}
