package com.zhangqi.mothercountry.controller;


import com.zhangqi.mothercountry.service.LabelService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @RequestMapping("/showall")
    public ResponseVo showAll(){
        ResponseVo responseVo = labelService.showAll();
        return responseVo;
    }

}
