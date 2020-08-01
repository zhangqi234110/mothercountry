package com.zhangqi.mothercountry.controller;


import com.zhangqi.mothercountry.service.LabelService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/mother")
public class HelloMotherController {


    @Autowired
    private LabelService labelService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public Map helloMother(){
        String token = UUID.randomUUID().toString();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("tip","欢迎来到的来联盟！");
        map.put("message","这里是妈妈们交流的圣地！测试一下");
        map.put("ss","是的撒旦撒旦");
        map.put("token",token);
        map.put("实现","12313");
        return map;
    }
    @RequestMapping("/ewr")
    public Map sd(){

        return null;
    }

    }

    @RequestMapping("/nihao")
    public String sq(){

        return "你好";
    }
    @RequestMapping("/token")
    public void ss(HttpServletRequest request){
        String token = request.getParameter("token");
        //String token = request.getHeader("token");
        System.out.println(token);

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
