package com.zhangqi.mothercountry.pojo;

import java.io.Serializable;

public class Label implements Serializable {

    private int id;
    private String name;

    private Topic topic;




    public Label() {
    }

    public Label(int id, String name,Topic topic) {
        this.id = id;
        this.name = name;
        this.topic=topic;
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

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
