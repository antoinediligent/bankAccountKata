package com.sg.kata;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private List<AccountStatement> accountStatementList;

    private double balance;

    public BankAccount() {
        this.accountStatementList = new ArrayList<>();
    }

    public void deposit(LocalDateTime date, double amount) throws BankAccountException {
        if(amount < 0) {
            throw new BankAccountException("cannot deposit a negative amount");
        }
        makeOperation(date, amount);
    }

    public void withdraw(LocalDateTime date, double amount) throws BankAccountException {
        if(amount > 0) {
            throw new BankAccountException("cannot withdraw a positive amount");
        }
        if(balance + amount < 0) {
            throw new BankAccountException("you don't have enough money");
        }
        makeOperation(date, amount);
    }

    private void makeOperation(LocalDateTime date, double amount) {
        balance += amount;
        AccountStatement accountStatement = new AccountStatement(date, amount, balance);
        accountStatementList.add(accountStatement);
    }

    public double getBalance() {
        return balance;
    }
}
