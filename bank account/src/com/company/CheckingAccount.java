package com.company;

public class CheckingAccount extends BankAccount{
    private double transactionCount;

    public CheckingAccount(double transactionCount, double b, String n) throws Exception {
        super(b, n);
        this.transactionCount = transactionCount;
    }

    public double getTransactionCount() {
        return transactionCount;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }
}
