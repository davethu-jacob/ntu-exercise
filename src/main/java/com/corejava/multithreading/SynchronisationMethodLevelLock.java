package com.corejava.multithreading;

/**
 * We are using the method level lock, so that the counter value will be updated correctly.
 */

public class SynchronisationMethodLevelLock {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread (() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
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

        System.out.println("The value of counter: " + counter);
    }

    private synchronized static void increment() {
        counter++;
    }
}
