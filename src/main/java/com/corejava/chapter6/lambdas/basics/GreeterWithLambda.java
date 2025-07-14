package com.corejava.chapter6.lambdas.basics;

@FunctionalInterface
interface Greeting {
    void perform();
}

class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}

public class GreeterWithLambda {
    public static void main(String[] args) {
        // option 1 - without Lambda expression
        Greeting greeting = new HelloWorldGreeting();
        greeting.perform();

        // option 2 - with Lambda expression
        Greeting lambdaGreeting = () -> System.out.println("Hello Lambda expression");
        lambdaGreeting.perform();
    }

}

