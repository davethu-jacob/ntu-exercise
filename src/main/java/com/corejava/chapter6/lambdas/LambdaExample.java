package com.corejava.chapter6.lambdas;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface StringFunction {
    String run(String str);
}

public class LambdaExample {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
