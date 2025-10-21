package com.corejava.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        System.out.println(list);

        // Create an iterator
        Iterator<String> iterator = list.iterator();

        // Modify the list after creating the iterator
        list.add("Grape");
        list.remove("Banana");
        System.out.println("List content after modification: " + list);

        System.out.print("Iterator contents: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
