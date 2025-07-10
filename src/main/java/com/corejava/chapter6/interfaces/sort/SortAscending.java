package com.corejava.chapter6.interfaces.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAscending {
    public static void main(String[] args) {
        int[] numbers1 = {53, 31, 34, 12, 18, 20};
        System.out.println("Original array order: " + Arrays.toString(numbers1));
        // sort in ascending order
        Arrays.sort(numbers1);
        System.out.println("Sorted array order: " + Arrays.toString(numbers1));

        String[] fruits = {"Water Melon", "Durian", "Rambutan", "Pineapple", "Mangosteen"};
        System.out.println("Original array order: " + Arrays.toString(fruits));

        Arrays.sort(fruits);
        System.out.println(fruits); // displays the reference and not the contents
        System.out.println("Sorted ascending order: " + Arrays.toString(fruits));
        System.out.println();

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(18);
        numbers2.add(21);
        numbers2.add(19);
        numbers2.add(10);
        numbers2.add(7);
        numbers2.add(6);
        System.out.println("Original Integer order: " + numbers2);
        Collections.sort(numbers2);
        System.out.println("Sorted Integer order: " + numbers2);
    }
}
