package com.ntu.interfacetutorial.ex66;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooooow");
    }



}
