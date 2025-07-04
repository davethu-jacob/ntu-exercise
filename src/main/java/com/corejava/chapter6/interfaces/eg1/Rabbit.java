package com.corejava.chapter6.interfaces.eg1;

public class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing*");
    }
}
