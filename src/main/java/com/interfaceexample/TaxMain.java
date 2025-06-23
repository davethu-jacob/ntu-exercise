package com.interfaceexample;

public class TaxMain {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2025(100_000);
        var report = new TaxReport(calculator);
        report.show();
    }
}
