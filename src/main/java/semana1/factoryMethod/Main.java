package semana1.factoryMethod;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.send("Mensaje de bienvenida!");

        factory = new SMSFactory();
        notification = factory.createNotification();
        notification.send("Código de verificación");

        factory = new PushFactory();
        notification = factory.createNotification();
        notification.send("Tienes una nueva alerta!");
    }
}
