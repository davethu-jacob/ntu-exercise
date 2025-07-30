package com.javabrains;

public class NestedLoops {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j= 0; j < 20; j++) {
                matrix[i][j] = i * j;
            }
        }

        for (int[] subArray : matrix) {
            for (int element : subArray) {
                System.out.println("Element is: " + element);
            }
        }
    }
}
