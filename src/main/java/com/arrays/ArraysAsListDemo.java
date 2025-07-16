package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        String[] family = {"Davethu", "Esther", "Michelle", "Melissa", "Paul", "Philip", "Joel"};
        System.out.println("Standard toString(): " + Arrays.toString(family));

        List familyList = Arrays.asList(family);
        System.out.println("Converted to List: " + familyList);

        // HashSet does not maintain order
        HashSet familyHashSet = new HashSet<>(Arrays.asList(family));
        System.out.println(familyHashSet);

        Integer[] birthDates = {6, 7, 18, 21, 19, 10};
        System.out.println(birthDates);


    }
}
