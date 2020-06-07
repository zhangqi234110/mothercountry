package com.zhangqi.mothercountry.controller;

import com.zhangqi.mothercountry.pojo.User;
import com.zhangqi.mothercountry.service.UserService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private UserService userService;

    @Test
    public void register() {
        User user = new User(13,"张杀杀杀","321456","312332");
        //ResponseVo register = userService.register(user);
        System.out.println(user);
    }

}