package com.corejava.chapter12.ex2;

public class MultiThreadingDemo2 {
    public static void main(String[] args) throws InterruptedException {
//        Book book = new Book();
//        book.start();

//        Runnable book = new Book();
        Runnable book = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Updating DB: " + i);
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(book);
        t1.start();

//        Number number = new Number();
//        number.start();
        Runnable number = new Number();
        Thread t2 = new Thread(number);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads have been executed");
    }
}
