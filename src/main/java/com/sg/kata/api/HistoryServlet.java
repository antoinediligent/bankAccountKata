package com.sg.kata.api;

import com.sg.kata.BankAccount;
import com.sg.kata.BankAccountSingleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HistoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BankAccount bankAccount = BankAccountSingleton.getBankAccount();
        response.getWriter().println(bankAccount.history());
    }
}
