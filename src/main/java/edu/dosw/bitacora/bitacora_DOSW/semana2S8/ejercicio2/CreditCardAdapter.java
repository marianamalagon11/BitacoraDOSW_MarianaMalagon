package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class CreditCardAdapter implements PaymentProvider {
    @Override
    public boolean pay(String user, double amount) {
        System.out.println("Procesando pago con Tarjeta de Crédito para " + user + ", monto: " + amount);
        return true;
    }
}

