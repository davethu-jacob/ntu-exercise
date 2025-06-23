package com.interfaceexample;

abstract class AbstractClass {
    protected int i = 0;
    static final int f = 100;

    abstract void show();

    void display() {
        System.out.println("Concrete method display()");
    }

}
public class AbstractClassExample extends AbstractClass {

    @Override
    void show() {
        System.out.println("This is concrete method show() declared in AbstractClass");
    }

    public static void main(String[] args) {
        var ac = new AbstractClassExample();
        ac.show();
        ac.display();
        System.out.println(AbstractClass.f);
    }
}
