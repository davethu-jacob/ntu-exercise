package com.ntu.composition.ex25;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Davethu", 'M');
        System.out.println(customer);

        Account account = new Account(99, customer, 999999.99);
        System.out.println(account);
        System.out.println("customer name: " + account.getCustomerName());
        System.out.println("current balance=$" + account.deposit(0.01));
        System.out.println("current balance=$" + account.deposit(1000000));
        System.out.println("current balance=$" + account.withdraw(500).withdraw(1000));

    }
}
