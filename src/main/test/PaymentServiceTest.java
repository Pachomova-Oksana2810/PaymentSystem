package main.test;

import main.java.model.CreditCard;
import main.java.model.PaymentMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    @Test
    void testCreditCardPaymentSuccess(){
        PaymentMethod card = new CreditCard(500);
        assertTrue(card.pay(300));
        assertEquals(200, card.getBalance());
    }

    @Test
    void testCreditCardPaymentFailure(){
        PaymentMethod card = new CreditCard(100);
        assertFalse(card.pay(300));
        assertEquals(100, card.getBalance());
    }
}
