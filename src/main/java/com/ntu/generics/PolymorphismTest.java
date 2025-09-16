package com.ntu.generics;


class C1 {
    public void sayHello() {
        System.out.println("C1 runs sayHello()");
    }

    public void methodC1() {
        System.out.println("C1 runs MethodC1()");
    }
}

class C2 extends C1 {
    @Override
    public void sayHello() {
        System.out.println("C2 runs overridden sayHello()");
    }

    public void methodC2() {
        System.out.println("C2 runs methodC2()");
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
        C1 c1Ref = new C2();
        c1Ref.methodC1();
        /* Cannot reference subclass method
        c1Ref.mwthodC2();
         */

        c1Ref.sayHello();
    }
}
