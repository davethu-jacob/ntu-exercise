package com.corejava.chapter6.lambdas.basics;

// Declare only one abstract method
@FunctionalInterface
interface Show {
    void display();
}

@FunctionalInterface
interface AddTwoNumbers {
    int total(int a, int b);
}

@FunctionalInterface
interface Greet {
    void greet();
}

@FunctionalInterface
interface SubtractTwoNumbers {
    int difference(int a, int b);
}

class Display implements Show {

    @Override
    public void display() {
        System.out.println("display()");
    }
}

public class Example1 {
    public static void main(String[] args) {
        // Option 1
        Show show = new Display();
        show.display();

        // Option 2 - Anonymous inner class
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers() {
            @Override
            public int total(int a, int b) {
                return a + b;
            }
        };
        System.out.println(addTwoNumbers.total(8, 25));
        System.out.println(addTwoNumbers.total(133, 345));

        // Above Anonymous inner class can be replaced with the following Lambda expression
        AddTwoNumbers addTwoNumbersLambda = (a, b) -> a + b;
        System.out.println(addTwoNumbersLambda.total(-25, 25));
        System.out.println(addTwoNumbersLambda.total(25, 25));

        // Option 3 - Lambda Expression
        Greet sayHello = () -> System.out.println("Hello World!");
        sayHello.greet();
        sayHello = () -> System.out.println("Good afternoon");
        sayHello.greet();

        // Another Lambda expression
        SubtractTwoNumbers subtractTwoNumbers = (a, b) -> (a-b);
        System.out.println(subtractTwoNumbers.difference(20, 5));
        System.out.println(subtractTwoNumbers.difference(100, 33));

    }
}
