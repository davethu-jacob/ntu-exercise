package com.corejava.chapter5.tostring;

import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        int[] luckNumbers = {2, 3, 5, 7, 11, 13};

        System.out.println("lucky numbers: " + luckNumbers);
        System.out.println("lucky numbers: " + Arrays.toString(luckNumbers));
    }
}
