package com.example.demo.service.impl;

import com.example.demo.dao.AiticleDao;
import com.example.demo.entity.ArticleEntity;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
/**
　* @description: 实现ArticleService接口
　* @author dqy
　* @date 2019/11/24
　*/
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    AiticleDao aiticleDao;

    @Override
    public List<ArticleEntity> getArticle(String tittle, Integer count) {
        List<ArticleEntity> list = aiticleDao.getArticle(tittle, count);
        return list;
    }
}
