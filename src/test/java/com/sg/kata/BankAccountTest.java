package com.sg.kata;

import org.junit.Test;

import java.time.LocalDateTime;

public final class BankAccountTest {

    @Test
    public void normalDepositTest() {
        try {

            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(LocalDateTime.now(), 10);
            org.junit.Assert.assertEquals(10, bankAccount.getBalance(), 0);

            bankAccount.deposit(LocalDateTime.now(), 20);
            org.junit.Assert.assertEquals(30, bankAccount.getBalance(), 0);

        } catch (BankAccountException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void negativeDepositTest() {
        try {
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(LocalDateTime.now(), -10);
        } catch (BankAccountException e) {
            org.junit.Assert.assertNotNull(e);
        }
    }
}
