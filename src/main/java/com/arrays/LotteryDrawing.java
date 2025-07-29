package com.arrays;

import java.util.Arrays;

public class LotteryDrawing {
    public static void main(String[] args) {
        int numbersToBeDrawn = 6;
        int highestNumberCanBeDrawn = 58;

        int[] numbers = new int[highestNumberCanBeDrawn];
        for (int i = 0; i < highestNumberCanBeDrawn; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        int[] result = new int[numbersToBeDrawn];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * highestNumberCanBeDrawn);
            result[i] = numbers[r];
            numbers[r] = numbers[highestNumberCanBeDrawn-1];
            highestNumberCanBeDrawn--;
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
