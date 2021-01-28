package com.sg.kata.api;

import com.sg.kata.BankAccount;
import com.sg.kata.BankAccountException;
import com.sg.kata.BankAccountSingleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class WithdrawServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String amountAsString = request.getParameter("amount");

        if(amountAsString == null || amountAsString.length() == 0) {
            response.getWriter().println("Please provide an amount");
            return;
        }

        double amount = Double.parseDouble(amountAsString);
        BankAccount bankAccount = BankAccountSingleton.getBankAccount();

        try {
            bankAccount.withdraw(LocalDateTime.now(), amount);
            response.getWriter().println(bankAccount.getBalance());
        } catch (BankAccountException e) {
            response.getWriter().println(e.getMessage());
            return;
        }
    }
}
