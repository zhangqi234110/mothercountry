package com.zhangqi.mothercountry.controller;


import com.zhangqi.mothercountry.service.LabelService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mother")
public class HelloMotherController {


    @Autowired
    private LabelService labelService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public Map helloMother(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("tip","欢迎来到妈妈邦！");
        map.put("message","这里是妈妈们交流的圣地！");
        return map;

    }

    @RequestMapping("/fenye")
    public ResponseVo show(){
        ResponseVo responseVo = labelService.showAll();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("actors",responseVo.getData());
        map.put("totalpage",10);
        map.put("nowpage",1);
        map.put("pageize",5);
        map.put("totalsize",100);
        responseVo.setData(map);
        return responseVo;


    }

    @RequestMapping("/jihe")
    public ResponseVo jihe(){
        ResponseVo responseVo = labelService.showAll();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("label",responseVo.getData());
        redisTemplate.opsForHash().putAll("pagesize",map);
        Map pagesize = redisTemplate.opsForHash().entries("pagesize");
        return  ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage(),pagesize);


    }

}
