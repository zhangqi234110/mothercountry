package com.zhangqi.mothercountry.filestream;

public class TestWrite {
    public static void main(String[] args) {
        Write write = new Write();
        Thread thread1 = new Thread(write);
        Thread thread2 = new Thread(write);
        Thread thread3 = new Thread(write);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
