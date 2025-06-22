package main.java.service;

import main.java.model.PaymentMethod;

public class PaymentService {

    public void processPayment(PaymentMethod method, double amount){
        System.out.println("Payment attempt " + amount + " with " + method.getName());
        if (method.pay(amount)){
            System.out.printf("Payment was successful %.2f. Remainder: %.2f\n", amount, method.getBalance());
        }else {
            System.out.println("Insufficient funds in the account");
        }
    }
}
