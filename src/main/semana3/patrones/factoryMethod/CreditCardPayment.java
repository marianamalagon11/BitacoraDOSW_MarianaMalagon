package semana3.patrones.factoryMethod;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con TARJETA DE CRÉDITO por $" + amount);
    }
}