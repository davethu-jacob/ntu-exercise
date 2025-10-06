package com.corejava.multithreading;

public class WaitAndNotifyDemo {
    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                t1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                t2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();


    }

    public static void t1() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Hello from method t1()");
            LOCK.wait();
            System.out.println("Back again to the method t1() after wait ...");
        }
    }

    public static void t2() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Hello from method t2()");
            LOCK.notify();
            System.out.println("Hello from method t2() after notifying ....");
        }
    }
}
