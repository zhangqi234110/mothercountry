package com.zhangqi.mothercountry.pojo;

import java.io.Serializable;

public class Score implements Serializable {

    private int id;
    private String name;
    private String uid;
    private int score;

    public Score(int id, String name, String uid, int score) {
        this.id = id;
        this.name = name;
        this.uid = uid;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
