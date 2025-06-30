package com.corejava.inheritance;

public class TestManager {
    public static void main(String[] args) {
        var boss = new Manager("Davethu", 48000, 1961, 11, 6);
        boss.setBonus(5000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("James", 60000, 1982, 6, 23);
        staff[2] = new Employee("Radheshyam", 30000, 1982, 12, 11);
        for (Employee e: staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
