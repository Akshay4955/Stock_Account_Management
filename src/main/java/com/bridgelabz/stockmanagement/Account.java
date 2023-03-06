package com.bridgelabz.stockmanagement;

public class Account {
    public long debitMoney(long accountBalance, double debitAmount) {
        accountBalance -= debitAmount;
        return accountBalance;
    }
}
