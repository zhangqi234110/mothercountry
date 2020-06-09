package com.zhangqi.mothercountry.dao;

import com.zhangqi.mothercountry.pojo.Score;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ScoreDao {

    /*
    * 排行榜前十
    * */
    List<Score> showAll();
}
