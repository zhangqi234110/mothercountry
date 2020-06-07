package com.zhangqi.mothercountry.pojo;

import java.io.Serializable;

public class Topic implements Serializable {

    private int id;
    private String topic;
    private String author;
    private String article;

    public Topic() {
    }

    public Topic(int id, String topic, String author, String article) {
        this.id = id;
        this.topic = topic;
        this.author = author;
        this.article = article;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
