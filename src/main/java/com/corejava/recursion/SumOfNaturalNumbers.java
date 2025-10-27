package com.corejava.recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = recursiveSummation(10);
        System.out.println("Sum of natural numbers: " + sum);

    }

    private static int recursiveSummation(int inputNumber) {
        if (inputNumber <= 1)
            return  inputNumber;
        return inputNumber + recursiveSummation(inputNumber - 1);
    }
}
