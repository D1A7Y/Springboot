package com.example.demo.dao;

import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
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
     * 根据用户ID更新用户内容
     *
     * @param userEntity User类，储存用户内容
     * @return Integer，成功返回影响条数，失败为0
     */
    Integer updateUserById(UserEntity userEntity);

    /**
     * 批量插入用户内容
     *
     * @param userEntity UserEntity[]数组
     * @return Integer，成功返回影响条数，失败为0
     */
    Integer insertAllUser(@Param("userEntity") UserEntity[] userEntity);

    /**
     * 批量插入用户内容
     *
     * @param userEntity List<UserEntity>，userEntity列表
     * @return Integer，成功返回影响条数，失败为0
     */
    Integer insertAllUser2(@Param("userEntity") List<UserEntity> userEntity);

    /**
     * 登陆
     *
     * @param userEntity 用户类
     * @return Integer，成功1，失败0
     */
    Integer login(UserEntity userEntity);

    /**
     * 根据name查询相同的User
     *
     * @param name 用户昵称
     * @return 返回UserEntity列表
     */
    List<UserEntity> querySameName(String name);

    /**
     * 根据昵称查询订单
     *
     * @param name 昵称
     * @return List<OrderEntity>，订单列表
     */
    List<OrderEntity> queryOrder(String name);

}
