package com.single.myblog.dao;

import java.util.List;

import com.single.myblog.entity.User;

public interface UserDao {

    List<User> findAll();
}
