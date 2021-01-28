package com.sg.kata;

public class BankAccountSingleton {

    private static BankAccount bankAccount;

    public static BankAccount getBankAccount() {
        if(bankAccount == null) {
            bankAccount = new BankAccount();
        }
        return bankAccount;
    }
}
