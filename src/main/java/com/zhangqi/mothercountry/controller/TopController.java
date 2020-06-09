package com.zhangqi.mothercountry.controller;

import com.zhangqi.mothercountry.service.ScoreService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/top")
public class TopController {

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/show")
    public ResponseVo showAll(){
        ResponseVo responseVo = scoreService.showAll();
        return  responseVo;

    }
}
