package com.corejava.chapter6.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInteger {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(20);
        numbers1.add(34);
        numbers1.add(18);
        numbers1.add(31);
        numbers1.add(53);
        numbers1.add(12);
        System.out.println("Original insertion order: " + numbers1);
        // natural sort
        Collections.sort(numbers1);
        System.out.println("Natural sort order: " + numbers1);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // > - ascending order, < - descending order
                return (o1 % 10 > o2 % 10) ? 1 : -1;
            }
        };

        Comparator<Integer> descendingSort = (o1, o2) -> (o2 > o1) ? 1 : -1;

        // sort by last digit value
        Collections.sort(numbers1, comparator);
        System.out.println("Sorted last digit by ascending order: " + numbers1);

    }
}
