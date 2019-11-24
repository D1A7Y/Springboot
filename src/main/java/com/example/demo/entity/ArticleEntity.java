package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
/**
 　* @author dqy
 　* @date 2019/11/24
 　*/
public class ArticleEntity {
    private Integer id;
    private String tittle;
    private Integer count;
    private String content;
    private String img;
    private String articleTypeId;
    private Date time;
}
