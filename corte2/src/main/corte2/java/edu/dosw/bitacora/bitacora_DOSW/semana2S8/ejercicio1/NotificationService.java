package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio1;

public class NotificationService {
    private static NotificationService instance;

    private NotificationService() {}

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void send(NotificationSender sender, String user, String message) {
        sender.sendNotification(user, message);
    }
}

