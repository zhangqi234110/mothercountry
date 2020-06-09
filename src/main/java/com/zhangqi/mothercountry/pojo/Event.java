package com.zhangqi.mothercountry.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Event {

    private int id;
    private String uid;
    private String content;
    private String  img;
    private Date time;

    public Event(int id, String uid, String content, String img, Date time) {
        this.id = id;
        this.uid = uid;
        this.content = content;
        this.img = img;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
