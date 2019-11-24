package com.example.demo.controller;

import com.example.demo.entity.ArticleEntity;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("/article")
/**
 　* @description: 文章控制
 　* @author dqy
 　* @date 2019/11/24
 　*/
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/query")
    public List<ArticleEntity> query(@RequestParam(value = "aasdawwsda", required = false) String tittle, @RequestParam(required = false) Integer count) {
        return articleService.getArticle(tittle, count);
    }
}
