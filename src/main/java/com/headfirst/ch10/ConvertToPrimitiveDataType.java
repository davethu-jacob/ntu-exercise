package com.headfirst.ch10;

import com.headfirst.ch9.Boo;

public class ConvertToPrimitiveDataType {
    public static void main(String[] args) {
        String s = "2";
        int x = Integer.parseInt(s);
        System.out.println(x);

        double d = Double.parseDouble("420.24");
        System.out.println(d);

        boolean b = Boolean.parseBoolean("TRUE");
        System.out.println(b);

//        String t = "two";
//        int y = Integer.parseInt(t);

        d = 42.501;
//        String doubleString = "" + d;
        System.out.println(d);
        System.out.println(Double.toString(d));
        System.out.println(String.valueOf(d));
    }
}
