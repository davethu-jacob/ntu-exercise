package com.ntu.interfacetutorial.ex65;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rc1 = new ResizableCircle(3);
        System.out.println(rc1);
        rc1.resize(10);
        System.out.println(rc1);
    }
}
