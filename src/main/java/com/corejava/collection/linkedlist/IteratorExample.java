package com.corejava.collection.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Banana");
        tropicalFruits.add("Pineapple");
        tropicalFruits.add("Mangosteen");
        tropicalFruits.add("Durian");
        System.out.println(tropicalFruits);

        // 2. Get a Iterator
        Iterator<String> tropicalFruitsIterator = tropicalFruits.iterator();

        // 3. Forward traversal
        System.out.println("Forward Traversal: ");
        System.out.println(tropicalFruits);
        while (tropicalFruitsIterator.hasNext()) {
            String fruit = tropicalFruitsIterator.next();
            if (fruit.equals("Durian"))
                tropicalFruitsIterator.remove();
        }
        System.out.println(tropicalFruits);

        // 1. Create a LinkedList
        LinkedList<String> temperateFruits = new LinkedList<>();
        temperateFruits.add("Apple");
        temperateFruits.add("Orange");
        temperateFruits.add("Strawberry");
        temperateFruits.add("Cherry");
        System.out.println(temperateFruits);

        // 2. Get a Iterator
        Iterator<String> temperateFruitIterator = temperateFruits.iterator();

        // 3. Forward Traversal
        System.out.println("Forward Traversal: ");
        System.out.println(temperateFruits);
        while (temperateFruitIterator.hasNext()) {
            String fruit = temperateFruitIterator.next();
            if (fruit.equals("Cherry"))
                temperateFruitIterator.remove();
        }
        System.out.println(temperateFruits);
    }
}
