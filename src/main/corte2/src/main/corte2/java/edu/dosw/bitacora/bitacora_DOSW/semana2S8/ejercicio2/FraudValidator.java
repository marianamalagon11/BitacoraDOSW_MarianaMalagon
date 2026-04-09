package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class FraudValidator extends PaymentValidator {
    @Override
    protected boolean doValidate(String user, double amount) {
        // Simulación: nunca hay fraude
        System.out.println("Validando fraude para " + user);
        return true;
    }
}

