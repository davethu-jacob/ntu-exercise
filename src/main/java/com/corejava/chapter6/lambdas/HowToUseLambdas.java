package com.corejava.chapter6.lambdas;

/*
1. To implement a user defined functional interface
2. A functional interface is an interface that contains only one abstract method
 */

interface FunctionalInterface {
    // abstract function
    void abstractFunction(int x);

    // non-abstract or default function
    default void normalFunction() {
        System.out.println("Hello");
    }
}
public class HowToUseLambdas {
    public static void main(String[] args) {
        FunctionalInterface fi = (int x) -> System.out.println(2*x);

        fi.abstractFunction(5);
    }
}
