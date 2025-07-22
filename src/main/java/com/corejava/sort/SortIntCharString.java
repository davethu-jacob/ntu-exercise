package com.corejava.sort;

import java.util.Arrays;

public class SortIntCharString {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 21, 19, 18, 6};
        System.out.println("Numbers in insertion order: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Numbers sorted in natural ascending order: " + Arrays.toString(numbers));

        char[] vowels = {'i', 'e', 'a', 'u', 'o'};
        System.out.println("Characters in insertion order: " + Arrays.toString(vowels));

        Arrays.sort(vowels);
        System.out.println("Characters sorted in natural ascending order: " + Arrays.toString(vowels));

        String[] name = {"Joel", "Philip", "Paul", "Melissa", "Michelle", "Esther", "Davethu"};
        System.out.println("Name in insertion order: " + Arrays.toString(name));

        Arrays.sort(name);
        System.out.println("Name sorted in natural ascending order: " + Arrays.toString(name));
    }
}
