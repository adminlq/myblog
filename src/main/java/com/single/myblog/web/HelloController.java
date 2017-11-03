package com.single.myblog.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.single.myblog.entity.Article;
import com.single.myblog.handler.MyException;
import com.single.myblog.service.ArticleService;
import com.single.myblog.utils.JsonUtil;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/hello")
    public String hello() throws MyException {

        Article article = articleService.getById(1);
        JSONObject json = (JSONObject) JSONObject.toJSON(article);

        return JsonUtil.resultStr(json);
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, Object> json() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Flyat");
        map.put("age", "25");
        map.put("sex", "man");
        System.out.println(map);
        return map;
    }
}
