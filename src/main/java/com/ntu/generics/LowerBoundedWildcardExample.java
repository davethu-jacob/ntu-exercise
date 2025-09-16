package com.ntu.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LowerBoundedWildcardExample {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println("Numbers list: " + numbers);

        List<Object> objects = new ArrayList<>();
        addNumbers(objects);
        System.out.println("Objects list: " + numbers);

    }

    // Add elements to the collection
    private static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
