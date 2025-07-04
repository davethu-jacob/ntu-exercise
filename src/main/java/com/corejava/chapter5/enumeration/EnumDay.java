package com.corejava.chapter5.enumeration;

import java.util.Scanner;

public class EnumDay {
    public static void main(String[] args) {
        // Enums = (Enumeration) A special kind of class that represents a fixed set of constants.
        // They improve code readability and are easy to maintain.
        // More efficient with switches when comparing Strings

        Day day = Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            day = Day.valueOf(response);
            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It's a working day");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is the weekend");
            }
        } catch(IllegalArgumentException iae) {
            System.out.println("Please enter a valid day!");
        }

        scanner.close();
    }
}
