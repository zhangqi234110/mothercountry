package com.zhangqi.mothercountry.pojo;

import java.io.Serializable;

public class User implements Serializable {


    private int id;
    private String name;
    private String password;
    private String uid;


    public User(int id, String name, String password, String uid) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.uid = uid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
