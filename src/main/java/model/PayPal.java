package main.java.model;

public class PayPal implements PaymentMethod{

    private double balance;

    public PayPal(double initialBalance) {
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
        return "Pay Pal";
    }
}
