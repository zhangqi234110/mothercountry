package com.zhangqi.mothercountry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/re")
public class ReController {

    @RequestMapping("/test1")
    public String t1(@RequestParam("name") String name){
        System.out.println("收到参数："+name.toString());
        return "hello";
    }

    @RequestMapping("/test2")
    public String t2(RedirectAttributes redirectAttributes){
        String name="张三";
        redirectAttributes.addAttribute("name",name);
        // redirectAttributes.addFlashAttribute("name",name);
        return "redirect:/re/test1";
    }

}
