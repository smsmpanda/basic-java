package com.rhtect.oop;

/*
* java中对象属性默认为公开（public)
* */
public class Oop {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.name = "zhangsan";
        stu1.age = 20;

        Student stu2 =new Student();
        stu2.name = "lisa";
        stu2.age = 24;


        System.out.println(stu1);
        System.out.println(stu2);
    }
}


