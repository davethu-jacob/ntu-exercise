package com.corejava.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIteration {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Rambutan");
        fruits.add("Durian");
        fruits.add("Pineapple");
        System.out.println("List of fruits: " + fruits);

        // 1. Using an iterator
        System.out.println("Iterate using an Iterator:");
        Iterator<String> fruitsIterator = fruits.iterator();
        while (fruitsIterator.hasNext()) {
            System.out.println(fruitsIterator.next());
        }

        // 2. Using an Enhanced for loop (for-each loop)
        System.out.println("Using an Enhanced for Loop:");
        for (String fruit : fruits)
            System.out.println(fruit);

        // 3. Using a traditional for loop - It is less efficient for Linked List when compared
        // to ArrayList because get(index) in a LinkedList requires traversing from the beginning
        // or end to reach the resulting index resulting in O(n) complexity for each access
        System.out.println("Using a traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Using a while loop
        System.out.println("Using a while loop:");
        int i = 0;
        while (i < fruits.size()) {
            System.out.println(fruits.get(i));
            i++;
        }

        // Using for-each() method
        System.out.println("Using for-each method:");
        fruits.forEach(System.out::println);

        fruitsIterator = fruits.iterator();
        if (fruitsIterator.hasNext())
            System.out.println("First fruit processed: " + fruitsIterator.next());
        System.out.println("Processing remaining fruits: ");
        fruitsIterator.forEachRemaining(fruit -> System.out.println("Remaining fruit: " + fruit));

        fruitsIterator = fruits.iterator();
        String firstFruit = fruitsIterator.next();
        System.out.println("First fruit in the LinkedList: " + firstFruit);
        fruitsIterator.remove();
        System.out.println("Is the fruits LinkedList empty?: " + fruits.isEmpty());
        System.out.println(fruits);




    }
}
