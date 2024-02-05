package com.rhtect.arraylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("张广");
        list.add("李四");
        list.add("张三三");
        list.add("王五三");
        list.add("赵六三");

        /*for (int i = 0; i < list.size(); i++) {
            String el = list.get(i);
            if(el.contains("三")) {
                list.remove(el);
            }
        }*/
        for (int i = list.size()-1; i >= 0; i--) {
            String el = list.get(i);
            if(el.contains("三")) {
                list.remove(el);
            }
        }
        System.out.println(list);
    }

    public static void BaicsHandle(){
        ArrayList list = new ArrayList();
        list.add("QQ");
        list.add("WeChat");
        list.add("Twitter");
        list.add("FaceBook");
        System.out.println(list);

        //size
        System.out.println(list.size());

        //add
        list.add(2,"Mine");

        //get
        list.get(3);

        //set
        System.out.println(list.set(0, "QQQ"));

        //remove by index
        System.out.println(list.remove(2));

        //remove by object
        System.out.println(list.remove("FaceBook"));

        //print
        System.out.println(list);
    }
}
