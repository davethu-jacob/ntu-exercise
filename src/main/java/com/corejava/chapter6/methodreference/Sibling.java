package com.corejava.chapter6.methodreference;

public class Sibling {
    private final String name;

    public Sibling(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sibling{" +
                "name='" + name + '\'' +
                '}';
    }
}
