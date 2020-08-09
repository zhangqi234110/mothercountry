package com.zhangqi.mothercountry.dao;

import com.zhangqi.mothercountry.pojo.Label;

import java.util.List;

public interface LabelDao {

    /*
    * 标签种类
    * */
    List<Label> showAll();

    int delete(int id);
}
