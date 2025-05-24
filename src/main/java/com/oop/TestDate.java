package com.oop;

public class TestDate {
    public static void main(String[] args) {
        Date today = new Date(2025,05,24);
        System.out.println("Today is: " + today);

        today.setYear(2024);
        System.out.println("The year is: " + today.getYear());
        today.setMonth(12);
        System.out.println("The month is: " + today.getMonth());
        today.setDay(31);
        System.out.println("The day is: " + today.getDay());
        System.out.println("Last day of last year is: " + today);

        today.setDate(2025, 12, 31);
        System.out.println("End of the year is: " + today);
    }
}
