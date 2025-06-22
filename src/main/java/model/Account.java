package main.java.model;

public class Account implements PaymentMethod{

    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount){
        this.balance += amount;

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getName() {
        return "Account";
    }
}
