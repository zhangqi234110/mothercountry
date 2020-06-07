package com.zhangqi.mothercountry.utils;

import java.util.Random;

public class InformationGenerator {

    public static int generateMessage(){
        Random random = new Random();
        int i = random.nextInt(9000);
        int j=i+1000;
        return j;

    }
}
