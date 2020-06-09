package com.zhangqi.mothercountry.dao;

import com.zhangqi.mothercountry.pojo.GuanZhu;

import java.util.List;

public interface GuanZhuDao {

    List<GuanZhu> showAll(String uid);
}
