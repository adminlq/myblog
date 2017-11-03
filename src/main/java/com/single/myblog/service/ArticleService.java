package com.single.myblog.service;

import java.util.List;

import com.single.myblog.entity.Article;

public interface ArticleService {

    Article getById(Integer id);

    List<Article> findRecommend();

    List<Article> findHotClick();

    List<Article> findAll(Integer pageNo, Integer pageSize, Integer type);
}
