package main.java.service;

import main.java.model.Account;
import main.java.model.PaymentMethod;

public class TransferService {
    public boolean transfer(PaymentMethod from, PaymentMethod to, double amount){
        if (from.pay(amount)){
            if (to instanceof Account a){
                a.deposit(amount);
            }
            return  true;
        }
        return  false;
    }
}
