package com.corejava.chapter6.methodreference;

import java.util.Arrays;

public class SimpleExample1 {
    public static void main(String[] args) {
        String[] fruits = {"Rambutan", "Durian", "Mango", "Pineapple", "Papaya"};

        // option 1
        System.out.println(Arrays.toString(fruits));

        // option 2 - using for loop
        System.out.println();
        System.out.println("Print using standard for loop");
        for(int i=0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // option 3 - using enhanced for loop
        System.out.println();
        System.out.println("Print using enhanced for loop");
        for (String fruit : fruits)
            System.out.println(fruit);

        // option 3 - using method reference
        System.out.println();
        System.out.println("Print using method reference");
        Arrays.stream(fruits).forEach(SimpleExample1::print);

    }

    static void print(String s) {
        System.out.println(s);
    }
}
