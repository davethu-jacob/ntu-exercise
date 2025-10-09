package com.corejava.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                concurrentMap.put("Key" + i, i);
                System.out.println("Writer added: Key" + i + " -> " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread readerThread = new Thread(() -> {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            concurrentMap.forEach((key, value) -> System.out.println("Reader read: " + key + " -> " + value));
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();

        System.out.println("\nFinal ConcurrentHashMap: " + concurrentMap);
    }
}
