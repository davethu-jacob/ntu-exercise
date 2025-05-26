/**
 * The Account class models a bank account with a balance
 */
package com.oop;

public class Account {
    private final int number;
    private double balance;

    public Account(int number) {
        this.number = number;
    }

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("Account[number=%d,balance=$%.2f]", number, balance);
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void transferTo(double amount, Account another) {
        if (balance >= amount) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
