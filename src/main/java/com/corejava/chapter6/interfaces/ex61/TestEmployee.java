package com.corejava.chapter6.interfaces.ex61;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

        Arrays.sort(staff);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

        var staff0 = new Employee("Harry Hacker", 35000);
        var staff1 = new Employee("Carl Cracker", 75000);

        System.out.println(staff0.compareTo(staff1));

    }
}

