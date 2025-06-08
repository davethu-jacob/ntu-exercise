package com.inheritance;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        credits = 0;
    }

    public void study() {
        credits++;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return String.format("%s%n  %s%n  Study credits: %d", super.getName(), super.getAddress(), credits);
    }
}
