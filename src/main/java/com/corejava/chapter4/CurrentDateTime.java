package com.corejava.chapter4;

import java.time.*;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        Instant currentInstant = Instant.now();
        System.out.println("Current UTC Timestamp (Instant): " + currentInstant);

        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();
        System.out.println("Current zone date time: " + currentZoneDateTime);
        System.out.println("Current zone offset: " + currentZoneDateTime.getOffset());
        System.out.println("Current year: " + currentZoneDateTime.getYear());
        System.out.println("Current month: " + currentZoneDateTime.getMonth());
        System.out.println("Current date: " + currentZoneDateTime.getDayOfMonth());
        System.out.println("Current day: " + currentZoneDateTime.getDayOfWeek());
        System.out.println("Current day of year: " + currentZoneDateTime.getDayOfYear());
        System.out.println("Time zone: " + currentZoneDateTime.getZone());

        LocalDate newYearsEve = LocalDate.of(2024, 12, 31);
        System.out.println("New years eve: " + newYearsEve);
        System.out.println("Today after 260 days from New years eve: " + newYearsEve.plusDays(260));

        Date rightNow = new Date();
        System.out.println(rightNow);
        String s = new Date().toString();
        System.out.println("rightNow: " + s);

        System.out.println(new Date());
        System.out.println(new Date().toString());
    }

}
