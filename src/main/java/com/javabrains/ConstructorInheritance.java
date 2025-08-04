package com.javabrains;

class A {
    public A() {
        System.out.println("A's no-arg constructor is called");
    }

    public A(int i) {
        System.out.println("A's constructor is called");
    }
}

class B extends A {
    public B() {
        System.out.println("B's no-arg constructor is called");
    }
}

class C extends A {
    public C(int i) {
        System.out.println("C's constructor is called: " + i);
    }
}

class D {
    public D(int i) {
        System.out.println("D's constructor is called: " + i);;
    }
}

class E extends D {
    public E(String s) {
        super(128);
        System.out.println("E's constructor is called: " + s);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C(25);
        D d = new D(256);
        E e = new E("Davethu");
    }
}
