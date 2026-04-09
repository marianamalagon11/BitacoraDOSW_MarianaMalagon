package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public abstract class PaymentValidator {
    private PaymentValidator next;

    public PaymentValidator setNext(PaymentValidator next) {
        this.next = next;
        return next;
    }

    public boolean validate(String user, double amount) {
        if (!doValidate(user, amount)) {
            return false;
        }
        if (next != null) {
            return next.validate(user, amount);
        }
        return true;
    }

    protected abstract boolean doValidate(String user, double amount);
}

