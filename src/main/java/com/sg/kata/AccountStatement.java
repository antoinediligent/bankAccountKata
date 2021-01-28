package com.sg.kata;

import java.time.LocalDateTime;

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
}
