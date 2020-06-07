package com.zhangqi.mothercountry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhangqi.mothercountry.dao")
public class MothercountryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MothercountryApplication.class, args);
    }

}
