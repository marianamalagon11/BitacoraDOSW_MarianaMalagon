package semana2.factoryMethod;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
