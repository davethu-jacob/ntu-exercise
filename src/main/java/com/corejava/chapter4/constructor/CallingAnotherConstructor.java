package com.corejava.chapter4.constructor;

public class CallingAnotherConstructor {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass("Davethu", 144000);

        MyClass myClass2 = new MyClass("Esther");

        MyClass myClass3 = new MyClass();

    }
}
