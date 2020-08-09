package com.zhangqi.mothercountry.card;

import java.util.TreeSet;

public class Compare {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Student());
        students.add(new Student("张三",10));
        students.add(new Student("lisi",9));
        students.add(new Student("王五",20));

        for (Student s:students){
            System.out.println(s.getName()+"  "+s.getAge());

        }
    }
}
