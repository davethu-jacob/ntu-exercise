package com.headfirst.ch11;

import java.util.HashSet;

/*
1. Uniqueness - It only stores unique elements. Duplicate additions are ignored
2. Unordered - The order of elements is not preserved and may vary
3. Performance - Offers average constant time performance for basic operations (add, remove, contains) due to hashing
4. Null elements - Can store one null element.
 */

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Create a HashSet to store String objects
        HashSet<String> fruits = new HashSet<>();

        // 2. Add elements to HashSet
        fruits.add("Apple");
        boolean isNotFoundInTheSet = fruits.add("Banana");
        System.out.println("Is the object 'Banana' not found in the HashSet? : " + isNotFoundInTheSet);

        fruits.add("Orange");
        // Adding a duplicate element will not be successful as HashSet stores unique elements
        isNotFoundInTheSet = fruits.add("Apple");
        System.out.println("Is the object 'Apple' not found in the HashSet? : " + isNotFoundInTheSet );

        // 3. Print the hashset and order is not guaranteed
        System.out.println("HashSet after adding elements: " + fruits);

        // 4. Check if an element exists in the HashSet
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does HashSet contains 'Banana': " + fruits.contains("Banana"));

        // 5. Get the size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // 6. Remove an element from the HashSet
        fruits.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + fruits);
        fruits.remove("Orange");
        System.out.println("HashSet after removing 'Orange' again: " + fruits);

        // 7. Iterate through the HashSet
        System.out.println("Iterating through the fruits HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. Clear all elements from the HashSet
        fruits.clear();
        System.out.println("Contents of HashSet after clear: " + fruits);
    }
}
