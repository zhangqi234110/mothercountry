package com.zhangqi.mothercountry.utils;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class PasswordCode {

    public static String encode(String code){
        String md5Password = DigestUtils.md5DigestAsHex(code.getBytes());
        return  md5Password;

    }

}
