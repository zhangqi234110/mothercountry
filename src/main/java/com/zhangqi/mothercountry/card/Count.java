package com.zhangqi.mothercountry.card;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Count {
   private static  Logger logger = LoggerFactory.getLogger(Count.class);

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100)+1;
        System.out.println("请输入您的数字，判断是否和随机数相等。");
        while (true){
            int j =random.nextInt(100)+1;
            if (i==j){
                System.out.println("找到你了，数字"+j);
                break;
            }else if (i>j){
                System.out.println("您输入的数字小了点。");
            }else if (i<j){

                System.out.println("您输入的数字大了点。");
            }

        }

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        objects.add("5");

        List<Object> objects1 = Collections.synchronizedList(objects);
        for (int k=0;k<objects1.size();k++){
            System.out.println(objects1.get(k));

        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        logger.info("当前日期："+format);


    }
}
