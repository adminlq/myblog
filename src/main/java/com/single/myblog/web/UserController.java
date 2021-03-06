package com.single.myblog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.single.myblog.entity.User;
import com.single.myblog.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String userList() {
        List<User> users = userService.findAll();
        User user = users.get(0);
        return JSON.toJSONString(user);

    }
}
