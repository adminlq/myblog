package com.single.myblog.entity;

import java.io.Serializable;

public class Article implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String author;
    private Integer clickCount;
    private String columns;
    private Long createDate;
    private String imgurl;
    private Integer recommend;
    private String title;
    private String content;
    private String sumary;

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public String getColumns() {
        return columns;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public String getImgurl() {
        return imgurl;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getSumary() {
        return sumary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }

}
