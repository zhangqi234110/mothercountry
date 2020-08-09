package com.zhangqi.mothercountry.TestHuaWei2;

import java.lang.reflect.Array;
import java.util.*;

public class CardMaxNumber {

    /*
    * 模拟小组持有的卡片数字
    * */
    public static  int createNumber(){
        //6位内的正整数生成
        Random random = new Random();
        int i = random.nextInt(1000000);
        return i;

    }

    //n表示小组成员人数
    public static  List memberNumber(int n){
       List list  = new ArrayList<>();
        for (int j=1;j<=n;j++){
            int number = CardMaxNumber.createNumber();
            list.add(number);
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println("请输入小组人数(人数不得超过25人)：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i>25||i<0){
            System.out.println("人数输入不符合规范！");
        }
        List list = CardMaxNumber.memberNumber(i);
        Collections.sort(list);
        String num="";
       for (int l=0;l<list.size();l++){
            System.out.println(list.get(l));
             num=list.get(l)+""+num;
        }
        System.out.println(i+"个人的卡片组成的最大数字是："+num);


    }
}
