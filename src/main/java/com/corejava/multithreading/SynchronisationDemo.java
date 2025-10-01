package com.corejava.multithreading;

public class SynchronisationDemo {
    private static int counter1 = 0;
    private static int counter2 = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread (() -> {
            for (int i = 0; i < 10000; i++) {
                counter1++;
                count();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter1++;
                count();
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

        System.out.println("The value of counter1: " + counter1);
        System.out.println("The value of counter2: " + counter2);
    }

    private synchronized static void count() {
        counter2++;
    }
}
