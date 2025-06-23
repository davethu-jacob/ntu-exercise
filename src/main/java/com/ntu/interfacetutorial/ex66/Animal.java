package com.ntu.interfacetutorial.ex66;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void greets();
}
