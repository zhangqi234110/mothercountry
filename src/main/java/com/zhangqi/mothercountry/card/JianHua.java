package com.zhangqi.mothercountry.card;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.HashSet;

public class JianHua {
    public static void main(String[] args) {
      /*  String s="A";
        String op = RoleEnum.valueOf(s).op();
        System.out.println(op);*/
        String s="B";
        String sc="张三";
        String op = RoleEnum.valueOf(s).op(sc);
        System.out.println(op);


        HashSet<Object> objects = new HashSet<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        System.out.println(objects);

    }
}
