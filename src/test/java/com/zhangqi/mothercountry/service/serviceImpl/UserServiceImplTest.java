package com.zhangqi.mothercountry.service.serviceImpl;

import com.zhangqi.mothercountry.dao.UserDao;
import com.zhangqi.mothercountry.pojo.User;
import com.zhangqi.mothercountry.service.UserService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {
    @Autowired
    private UserDao userDao;
    @Test
    void register() {
        User sss = new User(13, "张水水水水", "123456", "12344");
       // int register = userDao.register(sss);
        System.out.println("成功啦");
    }
}