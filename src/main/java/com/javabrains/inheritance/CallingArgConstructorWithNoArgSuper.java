package com.javabrains.inheritance;

class D {
    public D() {
        System.out.println("D's no-arg constructor is called");
    }
}

class E extends D {
    public E(int i) {
        System.out.println("E's arg constructor is called");
    }
}

public class CallingArgConstructorWithNoArgSuper {
    public static void main(String[] args) {
        D d = new D();
        E e = new E(128);
    }

}
