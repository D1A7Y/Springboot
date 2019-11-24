package com.example.demo.service;

import com.example.demo.entity.UserEntity;

import java.util.List;

/**
 * 　* @description: User接口
 * 　* @author dqy
 * 　* @date 2019/11/24
 *
 */
public interface UserService {
    /**
     * 查询所有User内容
     *
     * @return 返回List<UserEntity>
     */
    List<UserEntity> queryAllUser();

    /**
     * 通过ID来查询User内容
     *
     * @param id 需要查找所传入的ID
     * @return 返回UserEntity
     */
    UserEntity queryUserById(Integer id);

    /**
     * 插入用户
     *
     * @param userEntity 用户类
     * @return Integer，成功返回影响数，失败为0
     */
    Integer insertUser(UserEntity userEntity);

    /**
     * 根据用户id删除User
     *
     * @param id 用户id
     * @return Integer，成功返回影响条数，失败为0
     */
    Integer deleteUserById(Integer id);

    /**
     * 批量插入用户内容
     *
     * @param userEntity UserEntity[]数组
     * @return Integer，成功返回影响条数，失败为0
     */
    Integer updateUserById(UserEntity userEntity);

    /**
     * 登陆
     *
     * @param userEntity 用户类
     * @return Integer，成功1，失败0
     */
    Integer login(UserEntity userEntity);

    /**
     * s
     *
     * @param name s
     * @return s
     */
    List<UserEntity> queayName(String name);
}
