package com.oop;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Davethu", "D Jacob", 2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("ID is: " + e1.getId());
        System.out.println("first name is: " + e1.getFirstName());
        System.out.println("last name is: " + e1.getLastName());
        System.out.println("Salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
