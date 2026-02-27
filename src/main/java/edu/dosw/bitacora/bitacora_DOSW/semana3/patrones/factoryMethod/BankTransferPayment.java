package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.factoryMethod;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con TRANSFERENCIA BANCARIA por $" + amount);
    }
}