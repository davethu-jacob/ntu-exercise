package com.ntu.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        System.out.println("Sum of integers: " + sum(integers));

        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubles: " + sum(doubles));
    }

    // Read element from the collection
    private static double sum(List<? extends Number> numbers) {
        double total = 0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}
