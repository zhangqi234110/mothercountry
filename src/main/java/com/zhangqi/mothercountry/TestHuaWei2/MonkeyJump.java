package com.zhangqi.mothercountry.TestHuaWei2;

import java.util.Random;
import java.util.Scanner;

public class MonkeyJump {

    public static int jumpways(int n){
        /*
        * 假设全部以每次一步方式,这是第一种
        * */
        int onestep=1;

        /*
        * 若全部以每次3步跳跃，则可是为第二种
        * */
        int threestep=1;

        /*
        * 若混合使用跳一 步和跳3步，则方式繁多
        * */
        int i = n % 3;//台阶数对3取余，余数可能性为0，1，2，在余数里，可以采用3步跳或者i次一步跳.
        int j=n/3;//判断n个台阶中，有多少次3步跳。
        /*
        *涉及排列组合问题，n个台阶中3步跳和1步跳的位置做个排列组合,数学符号C(n,k)j的k次幂乘以i的（n-k）次幂，k的范围（0，n）
        *
        * */
        int m= new Random().nextInt(10000); //假设计算结果为m,这里假设以随机数代替计算结果
        int totalways= onestep+  threestep+m;

        return totalways;

    }

    public static void main(String[] args) {
        System.out.println("请输入台阶数：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();//输入台阶数
        int jumpways = MonkeyJump.jumpways(i);
        System.out.println("跳跃方式有"+jumpways+"种");

    }

}
