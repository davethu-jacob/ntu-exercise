package com.ntu.generics;

import java.util.Arrays;

public class ForEachLoopPrimitiveTest {
    public static void main(String[] args) {
        int[] iArray = {11, 22, 33, 44};
        for (int number : iArray) {
            System.out.print(number + " ");
            number += 99;
        }
        System.out.println();

        System.out.println(Arrays.toString(iArray));

        for (int i = 0; i < iArray.length; i++) {
            iArray[i] += 99;
        }
        System.out.println(Arrays.toString(iArray));
    }
}
