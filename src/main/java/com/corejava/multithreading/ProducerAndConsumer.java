package com.corejava.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {
    /**
     * The producer-consumer problem is a synchronization scenario where one or more producer
     * threads generate data and put into a shared buffer, while one or more consumer threads
     * retrieve and process the data from the buffer concurrently.
     */
    public static void main(String[] args) {

    }
}

class Worker {
    private int sequence = 0;
    private final Integer top;
    private final Integer bottom;
    private final List<Integer> container;
    private final Object lock = new Object();

    public Worker(Integer top, Integer bottom) {
        this.top = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }

    public void produce() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (container.size() == top) {
                    System.out.println("Container is full");
                    lock.wait();
                } else {
                    System.out.println(sequence + " added to the container");
                    container.add(sequence++);
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consume() {

    }
}
