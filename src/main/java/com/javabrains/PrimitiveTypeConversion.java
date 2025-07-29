package com.javabrains;

public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Value of int a: " + a);
        System.out.println("Value of double b: " + b);

        double c = 10.5;
        int d = (int)c; // must cast double to int, resulting in precision loss
        System.out.println("Value of d is: " + d);

        double e = 3 / 2;
        System.out.println("Value of e is: " + e);

        double f = 3.0 / 2;
        System.out.println("Value of f is: " + f);

        double g = 10;
        int h = 5;
        var i = g * h; // Automatic type promotion
        System.out.println("Value of i: " + i);
    }
}
