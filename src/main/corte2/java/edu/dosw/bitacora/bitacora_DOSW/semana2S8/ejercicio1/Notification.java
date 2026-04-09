package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio1;

public class Notification {
    private NotificationSender sender;

    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public void setSender(NotificationSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String user, String message) {
        NotificationService.getInstance().send(sender, user, message);
    }
}

