package com.headfirst.ch12;

import java.util.List;

public class PrintColors {
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Blue", "Green");
        System.out.println(allColors);

        System.out.println("Option 1");
        for (String color : allColors) {
            System.out.println(color);
        }

        System.out.println("Option 2");
        allColors.forEach(color -> System.out.println(color));

        System.out.println("Option 3");
        allColors.forEach(System.out::println);
    }
}
