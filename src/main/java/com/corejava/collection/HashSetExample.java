package com.corejava.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Create a HashSet to store String objects
        Set<String> fruits = new HashSet<>();

        // 2. Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("HashSet after adding elements: " + fruits);

        // 3. Check if element exists
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does HashSet contain 'Banana'?: " + containsBanana);

        boolean containsGrapes = fruits.contains("Grapes");
        System.out.println("Does HashSet contain 'Grapes'?: " + containsGrapes);

        // 4. Get the size of the HashSet
        System.out.println("Size of the HashSet: " + fruits.size());

        // 5. Remove a fruit
        fruits.remove("Apple");
        System.out.println("HashSet after removing 'Apple': " + fruits);

        // 6. Iterate through HashSet using for-each loop
        for (String fruit: fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 7. Clear all elements from the HashSet
        fruits.clear();
        System.out.println("HashSet after clear: " + fruits);

        // 8. Check if the HashSet is empty
        System.out.println("Is the HashSet empty?: " + fruits.isEmpty());

    }
}
