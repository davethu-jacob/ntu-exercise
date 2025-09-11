package com.ntu.generics;

public class AutoBoxUnboxing {
    public static void main(String[] args) {
        // Pre JDK 5
        Integer intObj = new Integer(5566);  // Wrap an int to Integer by constructing an instance of Integer
        System.out.println(intObj);
        int i = intObj.intValue();  // Unwrap Integer to int
        System.out.println(i);

        Double doubleObj = new Double(55.66);  // Wrap double to Double
        System.out.println(doubleObj);
        double d = doubleObj.doubleValue();  // Unwrap Double to double
        System.out.println(d);

        // JDK 5 and onwards
        Integer intObj1 = 5566;  // Autobox from int to Integer by the compiler
        System.out.println(intObj1);
        int i1 = intObj1;  // Auto unbox from Integer to int by the compiler
        System.out.println(i1);

        Double doubleObj1 = 55.66;  // Autobox from double to Double by the compiler
        System.out.println(doubleObj1);
        double d1 = doubleObj1;
        System.out.println(d1);  // Auto unbox from Double to double

    }
}
