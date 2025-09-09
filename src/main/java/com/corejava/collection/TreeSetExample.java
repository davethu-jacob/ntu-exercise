package com.corejava.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1. Create a TreSet of String
        Set<String> colors = new TreeSet<>();

        // 2. Add element to the TreeSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Blue");
        System.out.println("Elements in TreeSet: " + colors);

        // 3. Check if an element exist
        boolean containsBlue = colors.contains("Blue");
        System.out.println("Is the TreeSet contains 'Blue'?; " + containsBlue);

        // 4. Remove an element
        colors.remove("Blue");
        System.out.println("TreeSet after removing 'Blue': " + colors);

        // 5. Iterate through TreeSet using an iterator
        Iterator<String> colorIterator = colors.iterator();
        while (colorIterator.hasNext()) {
            System.out.print(colorIterator.next() + " ");
        }
        System.out.println();

    }
}
