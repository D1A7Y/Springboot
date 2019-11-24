package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;

@SpringBootTest
class DemoApplicationTests {
    private final static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    UserDao userDao;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {

        List<UserEntity> list = userService.queayName("name");

        System.out.println(list);
    }

}
