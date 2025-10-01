package com.corejava.multithreading;

public class DaemonUserThreadDemo {
    public static void main(String[] args) {
        Thread dThread = new Thread(new DaemonHelper());
        Thread uThread = new Thread(new UserThreadHelper());
        dThread.setDaemon(true);

        dThread.start();
        uThread.start();

    }
}

class DaemonHelper implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count < 500) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Daemon helper is running ...");
        }

    }
}

class UserThreadHelper implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User thread done with execution ...");
    }
}
