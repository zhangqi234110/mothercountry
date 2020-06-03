package com.zhangqi.mothercountry.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mother")
public class HelloMotherController {


    @RequestMapping("/hello")
    public Map helloMother(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("tip","欢迎来到妈妈邦！");
        map.put("message","这里是妈妈们交流的圣地！");
        return map;

    }
}
