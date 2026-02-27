package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.factoryMethod;

public class PayPalProcessor extends PaymentProcessor {
    @Override
    public Payment createPayment(double amount) {
        return new PayPalPayment();
    }
}