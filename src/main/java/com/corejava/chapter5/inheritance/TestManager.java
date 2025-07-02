package com.corejava.chapter5.inheritance;

import java.util.Objects;

public class TestManager {
    public static void main(String[] args) {
        var boss1 = new Manager("Davethu", 48000, 1961, 11, 6);
        var boss2 = new Manager("Davethu", 48000, 1961, 11, 6);
        boss1.setBonus(5000);
        boss2.setBonus(1000);

        var staff = new Employee[3];

        staff[0] = boss1;
        staff[1] = new Employee("James", 60000, 1982, 6, 23);
        staff[2] = new Employee("Radheshyam", 30000, 1982, 12, 11);
        for (Employee e: staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

        Employee e1 = new Employee("Davethu", 60000, 1961, 11, 6);
        Employee e3 = new Employee("Davethu", 60000, 1961, 11, 6);
        Employee e2 = e1;
        Employee e4 = null;
        System.out.println(e1.equals(e2));
        System.out.println(Objects.equals(e1, e3));
        System.out.println(Objects.equals(e1,e4));
        System.out.println(e1.getClass());
        System.out.println(Objects.equals(e1, boss1));
        System.out.println(boss1.equals(e1));
        System.out.println(boss1.equals(boss2));

    }
}
