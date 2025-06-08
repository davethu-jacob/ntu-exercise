package com.inheritance;

public class TestSuperclass {
    public static void main(String[] args) {
        Superclass superclass1 = new Superclass();
        System.out.println(superclass1);

        Superclass superclass2 = new Superclass("Test Superclass");
        System.out.println(superclass2);

        Subclass subclass = new Subclass();
        System.out.println(subclass);
    }
}
