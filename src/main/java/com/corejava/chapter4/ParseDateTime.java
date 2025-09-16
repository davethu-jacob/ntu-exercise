package com.corejava.chapter4;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDateTime {
    public static void main(String[] args) {
        String dateString = "2024-07-15";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed date: " + parsedDate);
    }
}
