package com.headfirst.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int HORIZONTAL_INCREMENT = 1;
    static final int VERTICAL_INCREMENT = GRID_LENGTH;
    
    private final int[] grid = new int[GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;
    
    String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }
    
    
    ArrayList<String> placeStartup(int startupSize) {
        int[] startupCoords = new int[startupSize];
        int attempts = 0;
        boolean success = false;
        
        startupCount++;
        int increment = getIncrement();
        
        while (!success & attempts++ < MAX_ATTEMPTS) {
            int location = random.nextInt(GRID_SIZE);
            
            for (int i = 0; i < startupCoords.length; i++) {
                startupCoords[i] = location;
                location += increment;
            }
            System.out.println("Trying: " + Arrays.toString(startupCoords));
            
            if (startupFits(startupCoords, increment)) {
                success = coordsAvailable(startupCoords);
            }
        }
        savePositionToGrid(startupCoords);
        ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
        System.out.println("Placed at: " + alphaCells);
        return alphaCells;
    }

    private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords) {
        ArrayList<String> alphaCells = new ArrayList<>();
        for (int index : startupCoords) {
            String alphaCoords = getAlphaCoordsFromIndex(index);
            alphaCells.add(alphaCoords);
        }
        return alphaCells;
    }

    private String getAlphaCoordsFromIndex(int index) {
        int row = calcRowFromIndex(index);
        int column = index % GRID_LENGTH;
        String letter = ALPHABET.substring(column, column + 1);
        return letter + row;
    }

    private int calcRowFromIndex(int index) {
        return index / GRID_LENGTH;
    }

    private void savePositionToGrid(int[] startupCoords) {
        
    }

    private boolean coordsAvailable(int[] startupCoords) {
        return true;
    }

    private int getIncrement() {
        return 0;
    }

    private boolean startupFits(int[] startupCoords, int increment) {
        return false;
    }
}
