package com.corejava.multithreading;

public class RunnableThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());

        // Create a thread using anonymous inner class
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 15; i++) {
                    System.out.println("Thread-3: " + i);
                }
            }
        });

        // Create a thread using Lambda expression
        Thread t4 = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                System.out.println("Thread-4: " + i);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class ThreadOne implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Thread-1: " + i);
        }
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Thread-2: " + i);
        }
    }
}


