package com.ntu.generics;

import java.util.Arrays;

public class ForEachLoopImmutableObjectTest {
    public static void main(String[] args) {
        String[] sArray = {"dog", "cat", "turtle"};
        for (String item : sArray) {
            System.out.print(item + " ");
            item += "hello";
        }
        System.out.println();
        System.out.println(Arrays.toString(sArray));

        int[] iArray = {22, 33, 44};
        for (int item : iArray) {
            System.out.print(item + " ");
            item += 99;
        }
        System.out.println();
        System.out.println(Arrays.toString(iArray));

    }
}
