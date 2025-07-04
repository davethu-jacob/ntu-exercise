package com.corejava.chapter5.enumeration;

import java.util.Scanner;

public class EnumSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size (SMALL/MEDIUM/LARGE/EXTRA_LARGE): ");
        String response = scanner.next().toUpperCase();
        try {
            Size size = Size.valueOf(response);
            switch (size) {
                case SMALL -> System.out.println("You have chosen SMALL size");
                case MEDIUM -> System.out.println("You have chosen MEDIUM size");
                case LARGE -> System.out.println("You have chosen LARGE size");
                case EXTRA_LARGE -> System.out.println("You have chosen EXTRA_LARGE size");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Please enter a valid size");
        }
    }

}

enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private final String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
