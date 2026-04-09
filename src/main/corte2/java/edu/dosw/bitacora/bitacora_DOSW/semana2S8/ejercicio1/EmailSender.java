package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio1;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String user, String message) {
        System.out.println("Enviando Email a " + user + ": " + message);
    }
}

