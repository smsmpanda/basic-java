package com.rhtect.math;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long d1 = d.getTime();
        System.out.println(d1);

        d1 += 2 * 1000;
        System.out.println(d1);

        Date d3 = new Date(d1);
        System.out.println(d3);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(sdf.format(d3));

        //sdf.parse("2023-08-20 17:10:34 周日 下午");
    }
}
