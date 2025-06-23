package com.interfaceexample;

interface I {
    int i = 10; //public static final

    void display(); // public abstract
}

public class InterfaceExample implements I {

    @Override
    public void display() {
        System.out.println("This is the implementation of display() of interface I");
    }

    public static void main(String[] args) {
        I iRef = new InterfaceExample();
        iRef.display();
        System.out.println(I.i);
    }


}
