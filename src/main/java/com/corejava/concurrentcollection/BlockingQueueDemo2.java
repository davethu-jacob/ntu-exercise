package com.corejava.concurrentcollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        // Producer thread
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // Consumer thread
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    int element = queue.take();
                    System.out.println("Consumed: " + element);
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();


    }
}
