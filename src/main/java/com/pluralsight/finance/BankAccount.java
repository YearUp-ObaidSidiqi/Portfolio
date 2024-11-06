package com.pluralsight.finance;

public class BankAccount implements IValuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Deposit $$ is been successful");
    }

    public void withdraw(double amount){
        System.out.println("withdraw $$ is been successful");
    }

    @Override
    public double getValue() {
        return 0;
    }
}
