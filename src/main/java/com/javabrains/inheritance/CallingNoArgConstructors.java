package com.javabrains.inheritance;

class A {
    public A() {
        System.out.println("A's no-arg constructor is called");
    }
}

class B extends A {
    public B() {
        System.out.println("B's no-arg constructor is called");
    }
}

class C extends B {
    public C() {
        System.out.println("C's no-arg constructor is called");
    }
}
/*
1. Super class's no-arg constructor is called automatically when you create an instance of the subclass
 */
public class CallingNoArgConstructors {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
