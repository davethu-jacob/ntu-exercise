package com.corejava.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample1 {
    public int capacity;
    Queue<Integer> buffer = new LinkedList<>();

    public ProducerConsumerExample1(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // wait until until there is space in the buffer
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // notify consumers that an item has been added to the buffer
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }

    public static void main(String[] args) {
        ProducerConsumerExample1 pc = new ProducerConsumerExample1(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.produce(i);
                    Thread.sleep(100); // simulate time taken to produce
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.consume();
                    Thread.sleep(150); // simulate time taken to consume
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
    }
}
