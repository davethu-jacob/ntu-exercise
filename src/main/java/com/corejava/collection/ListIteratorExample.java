package com.corejava.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        List<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Banana");
        tropicalFruits.add("Pineapple");
        tropicalFruits.add("Mangosteen");
        tropicalFruits.add("Durian");
        System.out.println(tropicalFruits);

        // 2. Get a ListIterator
        ListIterator<String> tropicalFruitListIterator = tropicalFruits.listIterator();

        // 3. Forward traversal
        System.out.println("Forward Traversal: ");
        System.out.println(tropicalFruits);
        while (tropicalFruitListIterator.hasNext()) {
            String fruit = tropicalFruitListIterator.next();
            if (fruit.equals("Banana"))
                tropicalFruitListIterator.add("Fig");
        }
        System.out.println(tropicalFruits);

        // 4. Backward Traversal
        System.out.println("Backward Traversal: ");
        while (tropicalFruitListIterator.hasPrevious()) {
            String fruit = tropicalFruitListIterator.previous();
            System.out.println(fruit);
        }

        // 1. Create a LinkedList
        List<String> temperateFruits = new LinkedList<>();
        temperateFruits.add("Apple");
        temperateFruits.add("Orange");
        temperateFruits.add("Strawberry");
        temperateFruits.add("Cherry");
        System.out.println(temperateFruits);

        // 2. Get a ListIterator
        ListIterator<String> temperateFruitListIterator = temperateFruits.listIterator();

        // 3. Forward Traversal
        System.out.println("Forward Traversal: ");
        System.out.println(temperateFruits);
        while (temperateFruitListIterator.hasNext()) {
            String fruit = temperateFruitListIterator.next();
            if (fruit.equals("Cherry"))
                temperateFruitListIterator.add("Peaches");
        }
        System.out.println(temperateFruits);

        // 4. Backward Traversal
        System.out.println("Backward Traversal: ");
        while (temperateFruitListIterator.hasPrevious()) {
            String fruit = temperateFruitListIterator.previous();
            System.out.println(fruit);
        }

        temperateFruitListIterator = temperateFruits.listIterator();
        temperateFruitListIterator.hasNext();
        String fruit = temperateFruitListIterator.next();
        System.out.println(fruit);
        temperateFruitListIterator.remove();
        System.out.println(temperateFruits);
    }
}
