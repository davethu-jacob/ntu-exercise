package com.corejava.chapter12.threads;

public class ThreadTest {
    public static final int DELAY = 10;
    public static final int STEPS = 1;
    public static final double MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        var bank = new Bank(4, 100000);
        Runnable task1 = () -> {
            for (int i = 0; i < STEPS; i++) {
                double amount = MAX_AMOUNT * Math.random();
                bank.transfer(0, 1, amount);
                try {
                    Thread.sleep((int) (DELAY * Math.random()));
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < STEPS; i++) {
                double amount = MAX_AMOUNT * Math.random();
                bank.transfer(1, 2, amount);
                try {
                    Thread.sleep((int) (DELAY * Math.random()));
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}

