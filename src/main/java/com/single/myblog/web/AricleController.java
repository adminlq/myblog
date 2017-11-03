package com.single.myblog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.single.myblog.entity.Article;
import com.single.myblog.service.ArticleService;

@RestController
@RequestMapping("/article")
public class AricleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/list")
    @ResponseBody
    public String findList(Integer pageNo, Integer pageSize, Integer type) {
        System.out.println("pageNo:" + pageNo);
        System.out.println("pageSize:" + pageSize);
        System.out.println("type:" + type);
        List<Article> articles = articleService.findAll(pageNo, pageSize, type);
        return JSONObject.toJSONString(articles);

    }

    @RequestMapping("/recommend")
    public String recommend() {
        List<Article> articles = articleService.findRecommend();
        return JSONObject.toJSONString(articles);

    }

    @RequestMapping("/hotClick")
    public String hotClick() {
        List<Article> articles = articleService.findHotClick();
        return JSONObject.toJSONString(articles);

    }

}
