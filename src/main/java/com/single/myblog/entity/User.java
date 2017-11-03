package com.single.myblog.entity;

import java.io.Serializable;

public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String email;
    private String job;
    private String nickName;
    private String password;
    private String phone;
    private String qq;
    private String summary;
    private String username;

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getQq() {
        return qq;
    }

    public String getSummary() {
        return summary;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
