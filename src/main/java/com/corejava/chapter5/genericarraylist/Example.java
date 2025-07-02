package com.corejava.chapter5.genericarraylist;

import com.corejava.chapter5.inheritance.Employee;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Employee> staff1 = new ArrayList<>();
        var staff2 = new ArrayList<Employee>();

        staff1.add(new Employee("Davethu", 48000, 1961, 11, 6));
        System.out.println(staff1.size());
        System.out.println(staff1.get(0));
        staff1.add(new Employee("Esther", 40000, 1963, 9, 7));
        System.out.println(staff1.size());
        System.out.println(staff1.get(1));

        for (Employee ee : staff1) {
            System.out.println(ee);
        }


    }
}
