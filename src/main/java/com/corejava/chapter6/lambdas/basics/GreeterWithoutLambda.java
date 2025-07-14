package com.corejava.chapter6.lambdas.basics;

public class GreeterWithoutLambda {

    public void greet() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        GreeterWithoutLambda greeterWithoutLambda = new GreeterWithoutLambda();
        greeterWithoutLambda.greet();
    }
}
