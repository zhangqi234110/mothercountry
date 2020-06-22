package com.zhangqi.mothercountry.pojo;

public class Fans {
    private int id;
    private String myuid;
    private String fansuid;

    public Fans(int id, String myuid, String fansuid) {
        this.id = id;
        this.myuid = myuid;
        this.fansuid = fansuid;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMyuid() {
        return myuid;
    }

    public void setMyuid(String myuid) {
        this.myuid = myuid;
    }

    public String getFansuid() {
        return fansuid;
    }

    public void setFansuid(String fansuid) {
        this.fansuid = fansuid;
    }
}
