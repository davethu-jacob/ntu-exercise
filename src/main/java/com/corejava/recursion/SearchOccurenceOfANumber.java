package com.corejava.recursion;

public class SearchOccurenceOfANumber {
    public static void main(String[] args) {
        int[] number = {-1, 0, 1, 2, 3, 4 , 7, 9, 10, 20};

        int index = binarySearch(number, 0, 9, 10);
        System.out.println("Searched number is found at index: " + index);
    }

    private static int binarySearch(int[] number, int startIndex, int endIndex, int numberToSearch) {
        if (startIndex > endIndex) {
            return -1;
        }
        int midIndex = (startIndex + endIndex) / 2;

        if (numberToSearch == number[midIndex]) {
            return midIndex;
        }

        if (numberToSearch < number[midIndex]) {
            return binarySearch(number, startIndex, midIndex - 1, numberToSearch);
        }

        return binarySearch(number, midIndex + 1, endIndex, numberToSearch);
    }
}
