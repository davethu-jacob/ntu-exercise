package com.headfirst;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        System.out.println("Random Double: " + randomNumber);

        int min = 0;
        int max = 100;
        randomIntExclusiveMax(min, max);

        min = 1;
        max = 10;
        randomIntInclusive(min, max);

        min = 0;
        max = 6;
        randomNUmberFromZeroToSix(min, max);
    }

    private static void randomNUmberFromZeroToSix(int min, int max) {
        int randomInt = (int) (Math.random() * 5);
        System.out.println("Random integer (0-6): " + randomInt);
    }

    private static void randomIntInclusive(int min, int max) {
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random integer (1-10): " + randomInt);
    }

    private static void randomIntExclusiveMax(int min, int max) {
        int randomInt = (int) (Math.random() * (max-min) + min) ;
        System.out.println("Random integer (0-99): " + randomInt);
    }
}
