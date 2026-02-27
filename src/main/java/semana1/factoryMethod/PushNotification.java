package semana1.factoryMethod;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }
}
