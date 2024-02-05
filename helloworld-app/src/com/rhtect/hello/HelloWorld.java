package com.rhtect.hello;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int [] arr = new int[5];
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number on terminal input:");
        String s = sc.next();
        System.out.println(s);*/
        String code = CreateCode(5);
        System.out.println(code);
    }

    public  static  String CreateCode(int len){
        String resultCode = "";
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int type = random.nextInt(3);
            switch (type){
                case 0:
                    resultCode += random.nextInt(10); //产生0-9的数字
                    break;
                case 1:
                    char c = (char) (random.nextInt(26) + 65);
                    resultCode+=c;
                    break;
                case 2:
                    char c2 = (char) (random.nextInt(26) + 97);
                    resultCode+=c2;
                    break;
            }
        }
        return  resultCode;
    }
}