package com.rhtect.math;

public class Test {
    public static void main(String[] args) {

        //绝对值
        System.out.println(Math.abs(-43));

        //向上取整
        System.out.println(Math.ceil(3.45));
        System.out.println(Math.ceil(3.662));

        //向下取整
        System.out.println(Math.floor(3.662));

        //四舍五入
        System.out.println(Math.round(4.523112));

        System.out.println(Math.max(12, 41));

        System.out.println(Math.pow(3, 3));

        System.out.println(Math.random()*10);

        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory()/1024/1024+"KB");
        System.out.println(r.freeMemory()/1024/1024+"MB");
    }
}
