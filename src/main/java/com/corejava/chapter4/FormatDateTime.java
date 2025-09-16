package com.corejava.chapter4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // custom format 1
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // custom format 2
        DateTimeFormatter anotherFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE");
        String anotherFormattedDate = now.format(anotherFormatter);
        System.out.println("Another formatted Date: " + anotherFormattedDate);
    }
}
