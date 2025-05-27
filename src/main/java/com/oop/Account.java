/**
 * The Account class models a bank account with a balance
 */
package com.oop;

public class Account {
    private final String id;
    private final String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=$%.2f]", id, name, balance);
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
