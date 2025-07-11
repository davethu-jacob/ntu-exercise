package com.corejava.chapter6.interfaces.eg1;

public class TestMain {
    public static void main(String[] args) {
        // interface = a template can be applied to a class
        // similar to inheritance, but specifies what a class has/must do.
        // classes can apply more than one interface, inheritance is limited to 1 super

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
