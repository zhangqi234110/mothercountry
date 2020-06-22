package com.zhangqi.mothercountry.filestream;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\download\\b.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s=null;
        //int i=0;
        while ((s=bufferedReader.readLine())!=null){
           // i++;
            System.out.println(s);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
