package com.corejava.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        System.out.println("size of LinkedList: " + fruits.size());
        System.out.println("Is LinkedList empty? " + fruits.isEmpty());

        // 2. Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grape");
        fruits.add(2, "Cherry");

        System.out.println("LinkedList: " + fruits);

        // 3. Check size and if empty
        System.out.println("Size of LinkedList: " + fruits.size());
        System.out.println("Is LinkedList empty? " + fruits.isEmpty());

        // 4. Access elements
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());
        System.out.println("Element of index 3 is: " + fruits.get(3));

        // 5. Remove elements
        fruits.removeFirst();
        fruits.removeLast();
        fruits.remove("Banana");
        fruits.remove(1);
        System.out.println("LinkedList after removals: " + fruits);

        // 6. Clear the LinkedList
        fruits.clear();
        System.out.println("LinkedList after clearing: " + fruits);


    }
}
