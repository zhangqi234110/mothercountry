package com.zhangqi.mothercountry.card;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String name;
    private int age;


    @Override
    public int compare(Student o1, Student o2) {
        int a= o1.getAge()-o2.getAge();
        return a;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
