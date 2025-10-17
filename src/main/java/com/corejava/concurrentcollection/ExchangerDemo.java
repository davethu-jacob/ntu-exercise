package com.corejava.concurrentcollection;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<Integer> exchanger = new Exchanger<>();

        Thread t1 = new Thread(new FirstThread(exchanger));
        Thread t2 = new Thread(new SecondThread(exchanger));

        t1.start();
        t2.start();
    }
}

class FirstThread implements Runnable {
    private final Exchanger<Integer> exchanger;

    FirstThread(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        int dataToSend = 10;
        System.out.println("First thread is sending data: " + dataToSend);

        try {
            Integer receivedData = exchanger.exchange(dataToSend);
            System.out.println("First thread received data: " + receivedData);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class SecondThread implements Runnable {
    private final Exchanger<Integer> exchanger;

    public SecondThread(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            int dataToSend = 20;
            System.out.println("Second thread is sending data: " + dataToSend);
            Integer receivedData = exchanger.exchange(dataToSend);
            System.out.println("Second thread received data: " + receivedData);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
