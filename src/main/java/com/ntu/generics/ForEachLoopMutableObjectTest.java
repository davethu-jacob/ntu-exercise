package com.ntu.generics;


import java.util.Arrays;

class MyMutableInteger {
    private int value;

    public MyMutableInteger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ("MyMutableInteger[value=" + value + "]");
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class ForEachLoopMutableObjectTest {
    public static void main(String[] args) {
        MyMutableInteger[] iArray = {new MyMutableInteger(11), new MyMutableInteger(22)};
        System.out.println(Arrays.toString(iArray));
        for (MyMutableInteger item : iArray) {
            System.out.println(item);
            item.setValue(99);
        }
        System.out.println(Arrays.toString(iArray));

    }
}
