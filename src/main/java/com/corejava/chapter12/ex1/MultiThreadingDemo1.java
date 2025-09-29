package com.corejava.chapter12.ex1;

public class MultiThreadingDemo1 {
    public static void main(String[] args) throws InterruptedException {   // thread 1 "main"
        Book book = new Book();
//        book.updateDB();
        book.start();  // thread 2
        if (book.isAlive())
            System.out.println("The thread 'book' is running - stage 1");

        Number number = new Number();
        number.start();  // thread 3

        if (book.isAlive())
            System.out.println("The thread 'book' is running - stage 2");
        book.join();
        number.join();

        if (book.isAlive())
            System.out.println("The thread 'book' is running - stage 3");

        System.out.println("Bye.....");
    }
}
