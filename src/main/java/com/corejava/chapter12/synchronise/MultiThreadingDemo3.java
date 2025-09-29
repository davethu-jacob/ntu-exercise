package com.corejava.chapter12.synchronise;

public class MultiThreadingDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Table t = new Table();

        Thread t1 = new Thread() {
            public void run() {
                try {
                    t.printTable(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                try {
                    t.printTable(9);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        t1.start();
        t2.start();

    }
}

class Table {
    synchronized void printTable(int n) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);
            Thread.sleep(1000);
        }
    }
}
