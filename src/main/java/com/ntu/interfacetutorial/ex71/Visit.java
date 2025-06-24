package com.ntu.interfacetutorial.ex71;

import java.time.LocalDate;
import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    @Override
    public String toString() {
        return String.format("Visit[%s]", customer);
    }
}
