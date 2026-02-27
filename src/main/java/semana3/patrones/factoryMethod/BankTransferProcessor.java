package semana3.patrones.factoryMethod;

public class BankTransferProcessor extends PaymentProcessor {
    @Override
    public Payment createPayment(double amount) {
        return new BankTransferPayment();
    }
}