package com.corejava.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = new int[]{-5, 20, 10, 3, 2, 0};
        System.out.println("Original array: " + Arrays.toString(data));
        mergeSort(data, 0, data.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(data));
    }

    private static void mergeSort(int[] data, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSort(data, startIndex, midIndex);
            mergeSort(data, midIndex + 1, endIndex);
            merge(data, startIndex, midIndex, endIndex);
        }
    }

    private static void merge(int[] data, int startIndex, int midIndex, int endIndex) {
        // build temp array to avoid modifying the original contents
        int[] temp = new int[endIndex - startIndex + 1];
        int i = startIndex;
        int j = midIndex + 1;
        int k = 0;

        // while both sub-array have values, then try and merge them in sorted order
        while (i <= midIndex && j <= endIndex) {
            if (data[i] <= data[j]) {
                temp[k] = data[i];
                i++;
                k++;
            } else {
                temp[k] = data[j];
                k++;
                j++;
            }
        }

        // Add the rest of the values from the left sub-array into the result
        while (i <= midIndex) {
            temp[k] = data[i];
            k++;
            i++;
        }

        // Add the rest of the values from the right sub-array into the result
        while (j <= endIndex) {
            temp[k] = data[j];
            k++;
            j++;
        }

        for (int l = startIndex; l <= endIndex; l++) {
            data[l] = temp[l - startIndex];
        }
    }
}
