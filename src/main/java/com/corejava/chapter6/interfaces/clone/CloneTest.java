package com.corejava.chapter6.interfaces.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. Public", 50000);
        System.out.println(original);
        original.setHireDay(2000, 1, 1);
        System.out.println(original);
        Employee copy;
        copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);

    }
}
