package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class LimitValidator extends PaymentValidator {
    @Override
    protected boolean doValidate(String user, double amount) {
        // Simulación: límite de 1000
        System.out.println("Validando límite para " + user);
        return amount <= 1000;
    }
}

