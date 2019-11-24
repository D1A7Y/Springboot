package com.example.demo.dao;

import com.example.demo.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
/**
　* @description: ArticleDao打错了
　* @author dqy
　* @date 2019/11/24
　*/
public interface AiticleDao {

    /**
     * 传入tittle和count来获得文章内容，将其以List<ArticleEntity>方式返回
     *
     * @param tittle:文章标题
     * @param count:点击数量
     * @return  List<ArticleEntity>
     */
    List<ArticleEntity> getArticle(@Param("tittle") String tittle, @Param("count") Integer count);

}
