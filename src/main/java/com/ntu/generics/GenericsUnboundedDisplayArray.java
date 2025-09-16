package com.ntu.generics;

public class GenericsUnboundedDisplayArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
    }

    private static <T> void displayArray(T[] stringArray) {
        for (T item : stringArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
