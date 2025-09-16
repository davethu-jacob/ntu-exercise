package com.ntu.generics;

public class PreGenericsDisplayArray {
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

    private static void displayArray(String[] stringArray) {
        for (String item : stringArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void displayArray(Character[] charArray) {
        for (Character item : charArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void displayArray(Integer[] intArray) {
        for (Integer item : intArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void displayArray(Double[] doubleArray) {
        for (Double item : doubleArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
