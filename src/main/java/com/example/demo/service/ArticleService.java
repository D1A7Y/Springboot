package com.example.demo.service;

import com.example.demo.entity.ArticleEntity;

import java.util.List;

/**
 * 　* @description: 文章接口
 * 　* @author dqy
 * 　* @date 2019/11/24
 *
 */
public interface ArticleService {

    /**
     * 传入tittle和count来获得文章内容，将其以List<ArticleEntity>方式返回
     *
     * @param tittle:文章标题
     * @param count:点击数量
     * @return List<ArticleEntity>
     */
    List<ArticleEntity> getArticle(String tittle, Integer count);
}
