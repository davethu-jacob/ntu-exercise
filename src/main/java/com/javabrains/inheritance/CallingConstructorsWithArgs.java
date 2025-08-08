package com.javabrains.inheritance;

class Z {
    public Z(int i) {
        System.out.println("Z's constructor is called: " + i);
    }
}

class Y extends Z {
    public Y(int i) {
        super(i);
        System.out.println("Y's constructor is called: " + i);
    }

}

public class CallingConstructorsWithArgs {
    public static void main(String[] args) {
        Z z = new Z(128);
        Y y = new Y(256);
    }
}
