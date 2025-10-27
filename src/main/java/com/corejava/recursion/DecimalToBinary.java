package com.corejava.recursion;

import java.io.FilterOutputStream;

public class DecimalToBinary {
    public static void main(String[] args) {
        String result = findBinary(233, "");
        System.out.println("The binary value is: " + result);
    }

    private static String findBinary(int decimal, String result) {
        if (decimal == 0)
            return result;
        result = decimal % 2 + result;
        return findBinary(decimal/2, result);
    }
}
