package com.ntu.generics;

import java.util.ArrayList;
import java.util.List;

public class J5ForEachLoopTest {
    public static void main(String[] args) {
        int[] numberArray = {11, 22, 33};
        // for-each loop on Array
        for (int number : numberArray) {
            System.out.println(number);
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        List<String> coffeeList = new ArrayList<>();
        coffeeList.add("Espresso");
        coffeeList.add("Latte");
        coffeeList.add("Americano");
        for (String item : coffeeList) {
            System.out.println(item);
        }
    }
}
