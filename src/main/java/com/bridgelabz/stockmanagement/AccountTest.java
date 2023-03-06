package com.bridgelabz.stockmanagement;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        long accountBalance = 10000;
        System.out.println("Welcome to account management");
        Scanner input = new Scanner(System.in);
        Account accountMain = new Account();
        System.out.println("Enter the amount you want debit");
        int debitAmount = input.nextInt();
        if (accountBalance > debitAmount)
            accountBalance = accountMain.debitMoney(accountBalance, debitAmount);
        else
            System.out.println("Debit amount exceeded account balance.");

        System.out.println("Account balance is " + accountBalance);
    }
}
