package com.rhtect.javabean;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("jiangrui");
        stu.setScore(129.12);
        System.out.println(stu.getName());
        System.out.println(stu.getScore());
    }
}
