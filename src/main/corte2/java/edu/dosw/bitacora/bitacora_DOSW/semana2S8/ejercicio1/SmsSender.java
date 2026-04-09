package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio1;

public class SmsSender implements NotificationSender {
    @Override
    public void sendNotification(String user, String message) {
        System.out.println("Enviando SMS a " + user + ": " + message);
    }
}

