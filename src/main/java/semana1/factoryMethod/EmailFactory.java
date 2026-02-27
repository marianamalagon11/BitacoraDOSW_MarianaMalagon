package semana1.factoryMethod;

public class EmailFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
