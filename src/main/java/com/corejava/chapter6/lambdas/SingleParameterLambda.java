package com.corejava.chapter6.lambdas;

import java.util.ArrayList;
import java.util.List;

public class SingleParameterLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Elements of the ArrayList: " );
        numbers.forEach(n -> System.out.println(n));

        System.out.println("Even elements of the ArrayList: ");
        numbers.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });
    }
}
