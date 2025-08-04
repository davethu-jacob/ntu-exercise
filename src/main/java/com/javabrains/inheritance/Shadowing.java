package com.javabrains.inheritance;

class A {
    public String m;
}

class B extends A {
    public int m;

    public void printValue() {
        this.m = 10;
        System.out.println(m);
    }

    public void printSuperClassValue() {
        super.m = "Hello";
        System.out.println(super.m);
    }
}

public class Shadowing {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.printValue();
        b.printSuperClassValue();
    }
}
