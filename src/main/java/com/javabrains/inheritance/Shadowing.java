package com.javabrains.inheritance;

class ShadowA {
    public String m;
}

class ShadowB extends ShadowA {
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
        ShadowA a = new ShadowA();
        ShadowB b = new ShadowB();

        b.printValue();
        b.printSuperClassValue();
    }
}
