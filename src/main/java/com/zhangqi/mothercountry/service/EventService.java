package com.zhangqi.mothercountry.service;

import com.zhangqi.mothercountry.pojo.Event;
import com.zhangqi.mothercountry.vo.ResponseVo;

public interface EventService {

    ResponseVo insert(Event event);
}
