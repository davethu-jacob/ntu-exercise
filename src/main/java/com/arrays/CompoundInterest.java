package com.arrays;

import java.util.Arrays;

public class CompoundInterest {
    public static void main(String[] args) {
        double STARTRATE = 10;
        int NRATES = 6;
        int NYEARS = 10;

        // set interest rates to 10% ..... 15%
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100;
        }
        System.out.println(Arrays.toString(interestRate));

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balance to 10,000
        for (int i = 0; i < balances[0].length; i++) {
            balances[0][i] = 10000;
        }

        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[j].length; j++) {
                // get previous year position
                double previousBalance = balances[i-1][j];
                // compute interest
                double interest = previousBalance * interestRate[j];
                // compute balance
                balances[i][j] = previousBalance + interest;
            }
        }

        // print row displaying interest rate
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.2f%%", 100 * interestRate[i]);
        }
        System.out.println();

        // print balance table
        for (double[] row : balances) {
            // print table row
            for (double column : row)
                System.out.printf("%,10.2f", column);
            System.out.println();
        }
    }



}
