package com.headfirst.ch10;

class StaticSuper {
    static {
        System.out.println("Super static block");
    }

    StaticSuper() {
        System.out.println("Super constructor");
    }
}
public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Static block: " + rand);
    }

    StaticTests() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("In main");
        StaticTests st = new StaticTests();
    }

}
