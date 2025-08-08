package com.javabrains.interfaces;

public class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing report....");
    }

    public static void main(String[] args) {
        Report r = new Report();
        r.print();
    }
}
