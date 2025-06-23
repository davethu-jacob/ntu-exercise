package com.ntu.interfacetutorial.ex66;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sonia");
        d1.greets();
        d1.greets(d1);
    }
}
