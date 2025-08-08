package com.javabrains.interfaces;

/*
1. In Java, an interface is an abstract type that defines a contract for classes.
2. It specifies a set of methods that a class must implement if it "implements" that interface.
3. Interfaces are used to achieve abstraction, enforce a certain behavior, and support polymorphism and multiple inheritance (of behavior) in Java.
 */
public interface Printable {
    public void print();
    public int PAGE_LIMIT = 100;
}
