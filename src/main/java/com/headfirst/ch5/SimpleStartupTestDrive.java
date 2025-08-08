package com.headfirst.ch5;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        int numberOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleStartUp ss = new SimpleStartUp();
        int randomNumber = (int) (Math.random() * 5);

        int[] locations = {randomNumber, randomNumber+1, randomNumber+2};
        ss.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("Enter a number");
            String result = ss.checkYourSelf(guess);
            numberOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }

        int userGuess = 2;
        String result = ss.checkYourSelf(userGuess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
