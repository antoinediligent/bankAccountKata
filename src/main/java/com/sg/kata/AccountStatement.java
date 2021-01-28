package com.sg.kata;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountStatement {

    private LocalDateTime date;

    private double amount;

    private double balance;

    public AccountStatement(LocalDateTime date, double amount, double balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        String operation;
        if(amount < 0) {
            operation = "withdrawal";
        } else {
            operation = "deposit";
        }
        return operation +
                "     " + date.format(DateTimeFormatter.ISO_DATE) +
                "     " + amount +
                "     " + balance +
                "\n";
    }
}
