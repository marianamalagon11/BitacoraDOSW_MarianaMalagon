package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class BankTransferAdapter implements PaymentProvider {
    @Override
    public boolean pay(String user, double amount) {
        System.out.println("Procesando pago con Transferencia Bancaria para " + user + ", monto: " + amount);
        return true;
    }
}

