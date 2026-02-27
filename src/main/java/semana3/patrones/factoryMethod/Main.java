package semana3.patrones.factoryMethod;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor;


        processor = new CreditCardProcessor();
        processor.processPayment(100.00);

        processor = new PayPalProcessor();
        processor.processPayment(250.00);

        processor = new BankTransferProcessor();
        processor.processPayment(500.00);
    }
}