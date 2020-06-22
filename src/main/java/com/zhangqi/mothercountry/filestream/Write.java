package com.zhangqi.mothercountry.filestream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write implements Runnable {

   int i=1;
    @Override
    public void run() {
        while (true){
            i++;
            synchronized (this){
                if (i<=10){
                    String a="我来啦；";
                    File file = new File("D:\\download\\c.txt");
                    FileWriter fileWriter = null;
                    try {
                        fileWriter = new FileWriter(file);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(a);
                        bufferedWriter.flush();
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                        fileWriter.close();
                        Thread.sleep(200);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("输入完毕！");
                    break;
                }


            }

        }
    }
}
