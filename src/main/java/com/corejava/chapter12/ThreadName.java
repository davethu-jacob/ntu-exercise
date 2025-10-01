package com.corejava.chapter12;

public class ThreadName {
    public static void main(String[] args) {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread name: " + Thread.currentThread().getPriority());
        System.out.println("Number of active threads: " + Thread.activeCount());
    }
}
