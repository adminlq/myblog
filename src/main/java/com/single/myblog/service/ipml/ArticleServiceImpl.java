package com.single.myblog.service.ipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.single.myblog.dao.ArticleDao;
import com.single.myblog.entity.Article;
import com.single.myblog.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article getById(Integer id) {
        return articleDao.getById(id);
    }

    @Override
    public List<Article> findRecommend() {
        List<Article> articles = articleDao.findRecommend();
        return articles;
    }

    @Override
    public List<Article> findHotClick() {
        List<Article> articles = articleDao.findHotClick();
        return articles;
    }

    @Override
    public List<Article> findAll(Integer pageNo, Integer pageSize, Integer type) {

        return articleDao.findAll(pageNo, pageSize, type);
    }

}
