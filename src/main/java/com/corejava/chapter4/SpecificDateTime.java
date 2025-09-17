package com.corejava.chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SpecificDateTime {
    public static void main(String[] args) {
        LocalDate specificDate = LocalDate.of(2025, 9, 16);
        System.out.println("Specific date: " + specificDate);

        LocalDate newYearsEve = LocalDate.of(2024, 12, 31);
        System.out.println("New year's eve: " + newYearsEve);

        LocalTime specificTime = LocalTime.of(22, 44, 45);
        System.out.println("Specific timme: " + specificTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2025, 9, 15, 22, 0, 5);
        System.out.println("Specific date and time: " + specificDateTime);
    }
}
