package com.pluralsight;

public class CreditCard implements IValuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge(double amount){
        System.out.println("$$ is been successfully charged");
    }
    public void pay(double amount){
        System.out.println("$$ is been successfully paid");
    }


    @Override
    public double getValue() {
        return 0;
    }
}
