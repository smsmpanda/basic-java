package com.rhtect.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("-------------------------------------------");
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        System.out.println("-------------------------------------------");
        BigDecimal c2 = a1.subtract(b1);
        System.out.println(c2);
        System.out.println("-------------------------------------------");
        BigDecimal c3 = a1.multiply(b1);
        System.out.println(c3);
        System.out.println("-------------------------------------------");
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c4);
        System.out.println("-------------------------------------------");
        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k);
    }
}
