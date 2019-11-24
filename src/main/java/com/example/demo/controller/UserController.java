package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("接口所在的类")
@RequestMapping("/user")
/**
 　* @description: 用户控制
 　* @author dqy
 　* @date 2019/11/24
 　*/
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUserList")
    @ApiOperation(value = "接口名", notes = "接口描述")
    public List<UserEntity> getUserList() {
        List<UserEntity> userEntities = userService.queryAllUser();
        return userEntities;
    }

    @GetMapping("/getUserById")
    public UserEntity getUserById(@RequestParam("id") Integer id) {
        UserEntity userEntity = userService.queryUserById(id);
        return userEntity;
    }

    @PostMapping("/insertUser")
    public Integer insertUser(@RequestBody UserEntity userEntity) {
        return userService.insertUser(userEntity);
    }

    @GetMapping("/deleteUserById")
    public Integer deleteUserById(@RequestParam("id") Integer id) {

        return userService.deleteUserById(id);
    }

    @PostMapping("/updateUser")
    public Integer updateUser(@RequestBody UserEntity userEntity) {
        return userService.updateUserById(userEntity);
    }
}
