package main.java.model;

public interface PaymentMethod {
    boolean pay(double amount);
    double getBalance();
    String getName();
}
