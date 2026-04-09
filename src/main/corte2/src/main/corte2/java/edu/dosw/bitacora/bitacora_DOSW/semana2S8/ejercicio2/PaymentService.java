package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio2;

public class PaymentService {
    private PaymentValidator validatorChain;

    public PaymentService(PaymentValidator validatorChain) {
        this.validatorChain = validatorChain;
    }

    public boolean processPayment(PaymentProvider provider, String user, double amount) {
        if (!validatorChain.validate(user, amount)) {
            System.out.println("Pago rechazado por validación");
            return false;
        }
        boolean result = provider.pay(user, amount);
        if (result) {
            System.out.println("Pago procesado exitosamente");
        } else {
            System.out.println("Error al procesar el pago");
        }
        return result;
    }
}

