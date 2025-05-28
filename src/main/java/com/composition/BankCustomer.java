package com.composition;

public class BankCustomer {
    private final int id;
    private final String name;
    private final char gender;

    public BankCustomer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", name, id);
    }
}
