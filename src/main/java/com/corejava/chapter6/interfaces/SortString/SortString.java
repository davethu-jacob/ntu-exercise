package com.corejava.chapter6.interfaces.SortString;

import java.util.*;

// TODO: Write a person class with name and age. We will then attempt to sort by name

class CustomStringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class SortString {
    public static void main(String[] args) {
        String[] names = {"Davethu", "Esther", "Abraham", "Mery Selver Rani", "Manickam"};
        System.out.println("Name in insert order: " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Name in (ascending) sort order: " + Arrays.toString(names));

        // provides a Comparator that sorts elements in reverse natural order (descending)
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Name in (descending) sort order: " + Arrays.toString(names));

        List<String> fruits = new ArrayList<>();
        fruits.add("Durian");
        fruits.add("durian");
        fruits.add("Pineapple");
        fruits.add("pineapple");
        fruits.add("Rambutan");
        fruits.add("rambutan");
        fruits.add("Banana");
        fruits.add("banana");
        fruits.add("Mangosteen");
        fruits.add("mangosteen");
        System.out.println("Fruits in insert order: " + fruits);

        Collections.sort(fruits);
        System.out.println("Fruits in (ascending) sort order: " + fruits);

        fruits.sort(Collections.reverseOrder());
        System.out.println("Fruits in (descending) sort order: " + fruits);

        // sort by string length
        Collections.sort(fruits, new CustomStringLengthComparator());
        System.out.println(fruits);


    }
}
