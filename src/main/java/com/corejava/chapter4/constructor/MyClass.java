package com.corejava.chapter4.constructor;

public class MyClass {
    private String name;
    private double salary;

    MyClass(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Two argument constructor is called");
    }

    MyClass(String name) {
        this(name, 168000);
        System.out.println("One argument constructor is called");
    }

    MyClass() {
        this("Michelle");
        System.out.println("No argument constructor is called");
    }
}
