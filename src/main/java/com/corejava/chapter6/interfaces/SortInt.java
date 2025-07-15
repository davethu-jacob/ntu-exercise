package com.corejava.chapter6.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class SortInt {
    public static void main(String[] args) {
        int[] number = {6, 7, 18, 21, 19, 10};
        System.out.println("Insertion order: " + Arrays.toString(number));

        Arrays.sort(number);
        System.out.println("Ascending sort: " + Arrays.toString(number));



    }
}

class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o2 > o1) ? 1 : -1;
    }
}
