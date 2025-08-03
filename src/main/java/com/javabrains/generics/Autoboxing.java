package com.javabrains.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {

        int i = 145;
        Integer x = i;  // Autoboxing
        System.out.println("Value of Integer x is: " + x);

        Integer y = 255;  // Unboxing
        i = y;
        System.out.println("Value of int i is: " + i);

        List<Integer> listOfInteger = Arrays.asList(0, 1, 2, 4, 8, 16, 32, 64, 128, 256);
        int first = listOfInteger.getFirst();
        System.out.println("First element in listOfInteger is: " + first);

        listOfInteger.set(9, 512);
        // You cannot add or remove element similar to Array behaviour
        // It will throw UnsupportedOperationException
//        listOfInteger.add(1024);
        int last = listOfInteger.getLast();
        System.out.println("Last element in listOfInteger is: " + last);

    }
}
