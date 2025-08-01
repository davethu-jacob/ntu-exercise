package com.javabrains;

public class LocalClassAndVariable {
    public static void main(String[] args) {
        final int i = 20;

        class Foo {
            int x = i;
        }

        // This local variable i is referenced from an inner class hence must be final
//        i = 10;
        System.out.println(i);

    }
}
