package com.corejava.chapter6.interfaces.eg1;

public class Hawk implements Predator {

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
}
