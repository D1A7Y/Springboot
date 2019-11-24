package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
/**
　* @description: 实现UserService接口
　* @author dqy
　* @date 2019/11/24
　*/
public class UserServiceImpl implements UserService {
    //IOC
    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> queryAllUser() {
        List<UserEntity> userEntities = userDao.queryAllUser();
        return userEntities;
    }

    @Override
    public UserEntity queryUserById(Integer id) {
        UserEntity userEntity = userDao.queryUserById(id);
        return userEntity;
    }

    @Override
    public Integer insertUser(UserEntity userEntity) {
        return userDao.insertUser(userEntity);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public Integer updateUserById(UserEntity userEntity) {

        return userDao.updateUserById(userEntity);
    }

    @Override
    public Integer login(UserEntity userEntity) {
        Integer a = userDao.login(userEntity);
        return a;
    }

    @Override
    public List<UserEntity> queayName(String name) {


        List<UserEntity> list = new ArrayList<>();
        list = userDao.querySameName(name);
        switch (list.get(0).getRole()) {
            case "admin":
                list = userDao.queryAllUser();
                break;
            case "classmate":
                list = userDao.querySameName(name);
                break;
            default:
        }

        return list;
    }


}
