package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class PaypalAdapter implements PaymentProvider {
    @Override
    public boolean pay(String user, double amount) {
        System.out.println("Procesando pago con PayPal para " + user + ", monto: " + amount);
        return true;
    }
}

