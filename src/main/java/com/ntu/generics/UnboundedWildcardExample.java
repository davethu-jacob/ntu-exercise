package com.ntu.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printList(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        printList(integerList);
    }

    private static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
