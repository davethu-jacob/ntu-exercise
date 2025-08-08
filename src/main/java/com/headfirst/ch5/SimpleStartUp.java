package com.headfirst.ch5;

public class SimpleStartUp {
    int[] locationCells;
    int numOfHits = 0;

    public String checkYourSelf(int userGuess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (userGuess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }

            System.out.println("Length of array: " + locationCells.length);
            if (numOfHits == locationCells.length) {
                result = "kill";
            }
            System.out.println(result);
        }
        return result;
    }

    void setLocationCells(int[] location) {
        locationCells = location;
    }
}
