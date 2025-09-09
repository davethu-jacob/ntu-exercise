package com.corejava.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx3 {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Phython");
        languages.add("Javascript");
        System.out.println("LinkedList: " + languages);

        languages.add(1, "Swift");
        System.out.println("LinkedList: " + languages);

        List<String> mammals = new LinkedList<>();
        mammals.add("Dog");
        mammals.add("Cat");
        mammals.add("Horse");
        System.out.println("Mammals: " + mammals);

        List<String> animals = new LinkedList<>();
        animals.add("Crocodile");
        animals.addAll(mammals);
        System.out.println("Animals: " + animals);

        // Add elements using ListIterator
        ListIterator<String> newLanguages = languages.listIterator();
        newLanguages.add("Cobol");
        System.out.println(languages);

    }
}
