package com.zhangqi.mothercountry.service;

import com.zhangqi.mothercountry.pojo.User;
import com.zhangqi.mothercountry.vo.ResponseVo;

public interface UserService {

    ResponseVo register(int id,String name,String password,String uid);
    ResponseVo login(String name,String password);
}
