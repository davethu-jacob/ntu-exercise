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
        System.out.println("Time zone: " + currentZoneDateTime.getZone());

        Date rightNow = new Date();
        System.out.println(rightNow);
        String s = new Date().toString();
        System.out.println("rightNow: " + s);
    }

}
