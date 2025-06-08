package com.inheritance;

public class TestStudent {
    public static void main(String[] args) {
        var s1 = new Student("Davethu", "53 Jalan Eco Santuari 1/2, 42500 Telok Panglima Garang");
        System.out.println(s1);
        var s2 = new Student("Esther", "18 Jalan USJ 3/1E, 47600 Subang Jaya");
        System.out.println(s2);
        System.out.println("Study credits: " + s1.getCredits());
        s1.study();
        System.out.println("Study credits: " + s1.getCredits());
    }
}
