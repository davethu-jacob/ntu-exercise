package com.corejava.concurrentcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronisedCollection {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Size of the List: " + list.size());

    }
}
