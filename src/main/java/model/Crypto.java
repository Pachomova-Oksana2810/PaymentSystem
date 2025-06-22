package main.java.model;

public class Crypto implements PaymentMethod{
    private  double balance;

    public Crypto(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getName() {
        return "Crypto";
    }
}
