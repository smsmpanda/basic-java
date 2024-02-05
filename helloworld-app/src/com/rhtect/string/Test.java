package com.rhtect.string;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        StringJoiner strJoiner  = new StringJoiner(",","[","]");
        strJoiner.add("I'm A");
        strJoiner.add("I'm B");
        strJoiner.add("I'm C");
        System.out.println(strJoiner);
    }
}
