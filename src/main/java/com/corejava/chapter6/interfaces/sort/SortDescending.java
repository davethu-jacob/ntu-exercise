package com.corejava.chapter6.interfaces.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] numbers = {53, 31, 34, 12, 18, 20};
        System.out.println("Original array order: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));

    }
}
