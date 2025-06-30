package com.ntu.aggregation.eg1;

public class Student {
    private String name;
    private int age;
    private Address address; // Aggregation Student "has-a" Address

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("Name=%s,Age=%d,%s", name, age, address.toString());
    }
}
