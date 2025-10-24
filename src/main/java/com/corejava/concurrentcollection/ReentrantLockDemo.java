package com.corejava.concurrentcollection;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private final ReentrantLock lock = new ReentrantLock();
    private int sharedData = 0;

    public void methodA() {
        lock.lock();
        System.out.println("methodA() lock count: " + lock.getHoldCount());
        try {
            // critical section
            sharedData++;
            System.out.println("Method A: sharedData = " + sharedData);

            // call methodB(), which also requires the lock
            methodB();

        } finally {
            lock.unlock();
            System.out.println("mathodA() lock count: " + lock.getHoldCount());
        }
    }

    public void methodB() {
        lock.lock();
        System.out.println("methodB() lock count: " + lock.getHoldCount());
        try {
            // critical section
            sharedData--;
            System.out.println("Method B: sharedData = " + sharedData);
        } finally {
            lock.unlock();
            System.out.println("methodB() lock count: " + lock.getHoldCount());
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo example = new ReentrantLockDemo();

        // create and start multiple threads
        for (int i = 0; i < 5; i++) {
            new Thread(example::methodA).start();
        }
    }
}
