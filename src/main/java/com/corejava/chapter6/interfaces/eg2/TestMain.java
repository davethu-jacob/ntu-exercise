package com.corejava.chapter6.interfaces.eg2;

/*
 1. Interface is a mechanism to achieve abstraction
 2. Variables in interface are public static final by default
 3. Interface primarily define methods that other classes must implement
*/

interface TestInterface {
    double CAPACITY = 60.0;
    void display();
}

// Class implementing the interface above
class TestClass implements TestInterface {
    @Override
    public void display() {
        System.out.println("Display method in TestClass");
        System.out.println(TestInterface.CAPACITY);
    }
}

public class TestMain {
    public static void main(String[] args) {
        TestClass tc1 = new TestClass();
        tc1.display();
//        TestInterface.CAPACITY = 80.0 - public static final
        System.out.println("Accessed CAPACITY using TestClass.Capacity: " + TestClass.CAPACITY);
        System.out.println("Accessed CAPACITY using TestInterface.Capacity: " + TestInterface.CAPACITY);
    }
}
