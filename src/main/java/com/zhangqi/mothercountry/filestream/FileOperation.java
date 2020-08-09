package com.zhangqi.mothercountry.filestream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        //将要写入txt文件的内容
       String content="野火烧不尽";
       String content2="，春风吹又生。";
        File file = new File("D:\\download\\a.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.newLine();
        bufferedWriter.write(content2);
        bufferedWriter.close();
        fileWriter.close();
       /* String content=",一岁一枯荣";
        File file = new File("D:\\download\\a.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.close();*/



    }
}
