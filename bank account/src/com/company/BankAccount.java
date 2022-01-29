package com.company;

public class BankAccount {
    double balance;
    String nome;

    public BankAccount(double s, String n) throws Exception {
        setNome(n);
        balance=s;
    }

    public String getNome() {
        return nome;
    }

    public double getBalance() {
        return balance;
    }

    public void setNome(String nome) throws Exception{
        if(nome != null)
            this.nome = nome;
        else
            new Exception("il nome non può essere null");
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount: " +
                "balance= " + balance +
                ", nome= " + nome;
    }
}
