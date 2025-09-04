package com.headfirst.ch11;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Create a HashSet to store String objects
        HashSet<String> fruits = new HashSet<>();

        // 2. Add elements to HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // Adding a duplicate element will not be successful as HashSet stores unique elements
        fruits.add("Apple");
        // Order is not guaranteed
        System.out.println("HashSet after adding elements: " + fruits);

        // 3. Check if an element exists in the HashSet
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does HashSet contains 'Banana': " + fruits.contains("Banana"));

        // 4. Get the size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // 5. Remove an element from the HashSet
        fruits.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + fruits);

        fruits.remove("Orange");
    }
}
