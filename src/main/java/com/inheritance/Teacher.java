package com.inheritance;

public class Teacher extends Person {
    private double monthlySalary;

    public Teacher(String name, String address, double monthlySalary) {
        super(name, address);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Teacher[name=%s,address=%s,monthly salary=%,.2f]", super.getName(), super.getAddress(), monthlySalary);
    }
}
