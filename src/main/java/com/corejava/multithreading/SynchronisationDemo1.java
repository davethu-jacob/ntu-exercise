package com.corejava.multithreading;

/**
 * In this implementation the counter value will not be updated correctly. This is because
 * each thread will update the counter value and the figure will not be accurate.
 */

public class SynchronisationDemo1 {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i ++)
                counter++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                counter++;
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter: " + counter);
    }

}
