package com.corejava.chapter4.constructor;

import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name;
    private double salary;

    private static Random generator = new Random();

    // static initialization block
    static {
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #" + nextId, salary);
    }

    // default constructor
    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
