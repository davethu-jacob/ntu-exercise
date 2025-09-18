package com.corejava.chapter4.constructor;

public class SuperClassConstructor {
    public static void main(String[] args) {
        ParentClass p1 = new ParentClass(64);

        ChildClass c1 = new ChildClass(64, "Davethu");
    }
}

class ParentClass {
    private int parentValue;

    public ParentClass(int parentValue) {
        this.parentValue = parentValue;
        System.out.println("Parent class constructor is called");
    }
}

class ChildClass extends ParentClass {
    private String childValue;

    ChildClass(int parentValue, String childValue) {
        super(parentValue);
        this.childValue = childValue;
        System.out.println("Child class constructor is called");
    }
}
