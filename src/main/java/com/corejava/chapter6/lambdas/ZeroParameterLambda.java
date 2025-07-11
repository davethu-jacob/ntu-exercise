package com.corejava.chapter6.lambdas;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface ZeroParameter {
    void display();
}
public class ZeroParameterLambda {
    public static void main(String[] args) {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero parameter lambda expression");
        zeroParamLambda.display();
    }
}
