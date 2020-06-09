package com.zhangqi.mothercountry.controller;

import com.zhangqi.mothercountry.pojo.Event;
import com.zhangqi.mothercountry.service.EventService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping("/add")
    public ResponseVo add(Event event){
        Date date = new Date();
        event.setTime(date);
        ResponseVo insert = eventService.insert(event);
        return insert;

    }
}
