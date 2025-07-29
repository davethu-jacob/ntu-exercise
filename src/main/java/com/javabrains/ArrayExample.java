package com.javabrains;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers; // Declares numbers as an int array
        numbers = new int[5]; // Now memory is allocated

//        double[] age = new int[10;]  // Not allowed
        int[] age = {21, 24, 30, 31, 33, 62, 64};
        System.out.println(Arrays.toString(age));

        for (int i : age)
            System.out.println(i);

        int[] smallPrimes = {17, 19, 23, 29, 31, 37};
        int[] copyOfSmallPrime = Arrays.copyOf(smallPrimes, smallPrimes.length * 2);

        System.out.println(Arrays.toString(smallPrimes));
        for (int i : copyOfSmallPrime)
            System.out.println(i);

    }
}
