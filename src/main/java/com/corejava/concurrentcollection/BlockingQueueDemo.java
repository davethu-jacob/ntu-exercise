package com.corejava.concurrentcollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    static final int QUEUE_CAPACITY = 10;
    static BlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
           for (int i = 1; i < 20; i++) {
               try {
                   taskQueue.put(i);
                   System.out.println("Task produced: " + i);
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread consumerOne = new Thread(() -> {
            while (true) {
                int task = 0;
                try {
                    task = taskQueue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                processTask(task, "consumerOne");
            }
        });

        Thread consumerTwo = new Thread(() -> {
            while (true) {
                int task = 0;
                try {
                    task = taskQueue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                processTask(task, "consumerTwo");
            }
        });

        producer.start();
        consumerOne.start();
        consumerTwo.start();



    }

    private static void processTask(int task, String consumerName) {
        System.out.println("Task: " + task + " is being processed by " + consumerName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task: " + task + " is completed by " + consumerName);
    }

}
