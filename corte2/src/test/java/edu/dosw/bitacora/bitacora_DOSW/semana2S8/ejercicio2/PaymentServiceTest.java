package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    private PaymentService paymentService;
    private String user = "cliente@correo.com";

    @BeforeEach
    void setUp() {
        // Cadena: saldo -> fraude -> límite
        PaymentValidator balance = new BalanceValidator();
        PaymentValidator fraud = new FraudValidator();
        PaymentValidator limit = new LimitValidator();
        balance.setNext(fraud).setNext(limit);
        paymentService = new PaymentService(balance);
    }

    @Test
    void testPaypalPaymentSuccess() {
        PaymentProvider provider = new PaypalAdapter();
        boolean result = paymentService.processPayment(provider, user, 500);
        assertTrue(result);
    }

    @Test
    void testStripePaymentOverLimit() {
        PaymentProvider provider = new StripeAdapter();
        boolean result = paymentService.processPayment(provider, user, 1500);
        assertFalse(result);
    }

    @Test
    void testCreditCardPayment() {
        PaymentProvider provider = new CreditCardAdapter();
        boolean result = paymentService.processPayment(provider, user, 800);
        assertTrue(result);
    }

    @Test
    void testBankTransferPayment() {
        PaymentProvider provider = new BankTransferAdapter();
        boolean result = paymentService.processPayment(provider, user, 1000);
        assertTrue(result);
    }

    @Test
    void testRemoveFraudValidator() {
        // Cadena: saldo -> límite (sin fraude)
        PaymentValidator balance = new BalanceValidator();
        PaymentValidator limit = new LimitValidator();
        balance.setNext(limit);
        PaymentService service = new PaymentService(balance);
        PaymentProvider provider = new PaypalAdapter();
        boolean result = service.processPayment(provider, user, 900);
        assertTrue(result);
    }
}

