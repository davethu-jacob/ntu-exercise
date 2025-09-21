package com.corejava.chapter4.record;

import java.util.Objects;

record PersonRecord(String name, String address) {
    // static variables
    public static String UNKNOWN_ADDRESS = "Unknown";

    // customized constructor implementations
    public PersonRecord {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    public PersonRecord(String name) {
        this(name, "");
    }
}

public class PosJdk14 {
    public static void main(String[] args) {
        PersonRecord p1 = new PersonRecord("Davethu", "53 Jalan Eco Santuari 1/2");
        PersonRecord p2 = new PersonRecord("Esther Yanamani", "53 Jalan Eco Santuari 1/2");
        PersonRecord p3 = new PersonRecord("Michelle");
        PersonRecord p4 = new PersonRecord("Melissa", PersonRecord.UNKNOWN_ADDRESS);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(PersonRecord.UNKNOWN_ADDRESS);
        System.out.println(p4);
    }
}
