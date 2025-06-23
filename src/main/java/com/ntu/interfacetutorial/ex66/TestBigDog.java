package com.ntu.interfacetutorial.ex66;

public class TestBigDog {
    public static void main(String[] args) {
        BigDog bd1 = new BigDog("Sonia");
        bd1.greets();
        Dog d1 = new Dog("Kiara");
        bd1.greets(d1);
        bd1.greets(bd1);
    }
}
