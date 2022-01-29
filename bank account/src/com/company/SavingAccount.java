package com.company;

public class SavingAccount extends BankAccount{
    private double interestRate;

    SavingAccount(double interestRate, double balance, String nome) throws Exception {
        super(balance, nome);
        this.interestRate=interestRate;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    public void addInterest(){

    }
}
