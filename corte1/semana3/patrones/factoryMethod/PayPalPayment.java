package semana3.patrones.factoryMethod;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con PAYPAL por $" + amount);
    }
}