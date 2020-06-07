package com.zhangqi.mothercountry.dao;

import com.zhangqi.mothercountry.pojo.User;

public interface UserDao {

    /*
    * 用户注册
    * */
    int register(int id,String name,String password,String uid);

    /*
    * 用户登录
    * */
    String login(String name,String password);
}
