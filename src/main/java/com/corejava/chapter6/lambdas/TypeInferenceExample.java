package com.corejava.chapter6.lambdas;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface StringLengthLambda {
    int getLength(String s);
}


public class TypeInferenceExample {
    public static void main(String[] args) {

        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello World!"));

        // parenthesis can be removed if only one argument in the Lambda expression
        StringLengthLambda myTypeInferenceLambda = s -> s.length();
        System.out.println(myTypeInferenceLambda.getLength("Hello World!"));

        printLength(s -> s.length());

    }

    public static void printLength(StringLengthLambda l) {
        System.out.println(l.getLength("Hello World!"));
    }
}
