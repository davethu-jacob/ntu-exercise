package com.corejava.chapter12.ex1;

class Book extends Thread {
    // public void updateDB()
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating DB: " + i);
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
