package com.zhangqi.mothercountry.controller;

import com.zhangqi.mothercountry.pojo.User;
import com.zhangqi.mothercountry.service.UserService;
import com.zhangqi.mothercountry.utils.InformationGenerator;
import com.zhangqi.mothercountry.utils.PasswordCode;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {


        Jedis jedis = new Jedis("localhost");


    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public ResponseVo register(User user){
        String uid= UUID.randomUUID().toString();
        user.setUid(uid);
        String encode = PasswordCode.encode(user.getPassword());
        user.setPassword(encode);
        ResponseVo register = userService.register(user.getId(),user.getName(),user.getPassword(),user.getUid());
        return  ResponseVo.Success(StatusCode.REGISTER_SUCCESS.getCode(),StatusCode.REGISTER_SUCCESS.getMessage());

    }


    /*
    * 帐号密码登录
    * */
    @RequestMapping("/login")
    public ResponseVo login(String name,String password){
        String encode = PasswordCode.encode(password);
        ResponseVo login = userService.login(name, encode);
        return login;
    }

    /*
    * 获取验证码
    * */
    @RequestMapping("/getmessage")
    public ResponseVo getMessage(String phonenumber){
        //开启流水线
        Pipeline pipelined = jedis.pipelined();
        int i = InformationGenerator.generateMessage();
         pipelined.set(phonenumber + "message",i+"");
         //设置key过期时间，确定短信验证码的存活时间
         pipelined.expire(phonenumber + "message", 30);

        List<Object> objects = pipelined.syncAndReturnAll();
        jedis.close();
        return ResponseVo.Success(StatusCode.MESSAGE_TIP.getCode(),StatusCode.MESSAGE_TIP.getMessage(),i);

    }

    /*
    * 短信登录
    * */
    @RequestMapping("/loginbymessage")
    public ResponseVo loginbymessage(String phonenumber,int message){
        String info = jedis.get(phonenumber + "message");
        if (info!=null&&info.equals(message+"")){
            return ResponseVo.Success(StatusCode.LOGIN_SUCCESS.getCode(), StatusCode.LOGIN_SUCCESS.getMessage());
        }else {
            return ResponseVo.Success(StatusCode.LOGIN_ERROR.getCode(),StatusCode.LOGIN_ERROR.getMessage());
        }

    }


}
