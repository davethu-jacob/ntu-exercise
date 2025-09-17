package com.corejava.chapter4.statictest;

public class StaticTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        for (Employee employee : staff) {
            System.out.println("name=" + employee.getName() + ",id=" + employee.getId() + ",salary=" + employee.getSalary());
        }
        int n = Employee.getNextId();
    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = getNextId();
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

    public static int getNextId() {
        int r = nextId;
        nextId++;
        return r;
    }
}
