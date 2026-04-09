package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class BalanceValidator extends PaymentValidator {
    @Override
    protected boolean doValidate(String user, double amount) {
        // Simulación: siempre hay saldo suficiente
        System.out.println("Validando saldo para " + user);
        return true;
    }
}

