package com.corejava.chapter4;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatterExample {
    public static void main(String[] args) {
        double number = 123456.789;

        // Default locale
        NumberFormat defaultFormat = NumberFormat.getInstance();
        System.out.println("Default format: " + defaultFormat.format(number));

        // Specific locale (German)
        NumberFormat germanyFormat = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println("Germany format: " + germanyFormat.format(number));

        // Currency Format (US Dollar)
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Currency format (US): " + currencyFormat.format(number));

        // Currency Format (UK Pound)
        NumberFormat ukCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Currency format (UK): " + ukCurrencyFormat.format(number));

        // % format
        double percentValue = 0.75;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println("% format (US): " + percentFormat.format(percentValue));

        // Integer format
        NumberFormat integerFormat = NumberFormat.getIntegerInstance();
        System.out.println("Integer format: " + integerFormat.format(number));
    }
}

