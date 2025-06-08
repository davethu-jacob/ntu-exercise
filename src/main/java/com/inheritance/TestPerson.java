package com.inheritance;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Davethu", "53 Jalan Eco Santuari 1/2, 42500 Telok Panglima Garang");
        System.out.println(p1);
        var p2 = new Person("Esther", "18 Jalan USJ 3/1E, 47600 Subang Jaya");
        System.out.println(p2);
    }
}
