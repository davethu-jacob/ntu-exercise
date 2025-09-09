package com.headfirst.ch11;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1. Create s TreeSet with natural ordering
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2. Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);

        System.out.println("Numbers natural order: " + numbers);

        // 3. Create a TreeSet with custom ordering (descending)

//        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());
        TreeSet<String> names = new TreeSet<>();
        names.add("Michelle");
        names.add("Davethu");
        names.add("Esther");
        names.add("Melissa");
        names.add("Paul");
        names.add("Philip");
        names.add("Joel");
        System.out.println("Names in descending order: " + names);

        // 4. Common operations
        System.out.println("First number: " + numbers.first());
        System.out.println("Last number: " + numbers.last());
        System.out.println("Contains 50?: " + numbers.contains(50));
        System.out.println("Removing 20?: " + numbers.remove(20));
        numbers.clear();
        System.out.println("Remove all?: " + numbers);
        System.out.println("First name: " + names.first());
    }
}
