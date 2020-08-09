package com.zhangqi.mothercountry.pojo;

public class GuanZhu {
    private int id;
    private String uid;
    private String uid2;

    //private  Event event;

    public GuanZhu(int id, String uid, String uid2) {
        this.id = id;
        this.uid = uid;
        this.uid2 = uid2;
       // this.event = event;
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

    public String getUid2() {
        return uid2;
    }

    public void setUid2(String uid2) {
        this.uid2 = uid2;
    }


}
