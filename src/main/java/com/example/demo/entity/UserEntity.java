package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEntity {
    public UserEntity(String name,String password,String username){
    this.name = name;
    this.pwd = password;
    this.username = username;

    }
    private Integer id;
    private String name;
    private String pwd;
    private String username;
    private String role;
}
