package main.java.model;

public class CreditCard implements PaymentMethod{
    private  double balance;

    public CreditCard(double initialBalance) {
        this.balance = initialBalance;
    }
    public boolean pay(double amount){
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
        return "Credit Card";
    }

}
