package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.GenaralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController("/user")
/**
 　* @description: 登录控制
 　* @author dqy
 　* @date 2019/11/24
 　*/
public class LoginController {
    @Autowired
    UserService userService;

    @Autowired
    GenaralService genaralService;

    @PostMapping("/login")
    public HashMap login(@RequestBody UserEntity userEntity) {
        Integer a = userService.login(userEntity);
        HashMap hashMap = new HashMap(16);
        hashMap.put("login", a);
        return hashMap;
    }

    @PostMapping("/general")
    public Integer general() {
        genaralService.test();
        return 1;
    }
}
