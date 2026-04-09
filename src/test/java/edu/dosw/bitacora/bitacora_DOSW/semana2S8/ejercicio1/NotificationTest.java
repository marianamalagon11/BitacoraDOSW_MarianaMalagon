package edu.dosw.bitacora.bitacora_DOSW.semana2S8.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationTest {
    private Notification notification;
    private String user = "usuario@correo.com";
    private String message = "¡Hola!";

    @BeforeEach
    void setUp() {
        notification = new Notification(new EmailSender());
    }

    @Test
    void testEmailSender() {
        notification.notifyUser(user, message);
        notification.setSender(new SmsSender());
        notification.notifyUser(user, message);
        notification.setSender(new PushSender());
        notification.notifyUser(user, message);
    }

    @Test
    void testChangeSenderDynamically() {
        notification.setSender(new SmsSender());
        notification.notifyUser(user, message);
        notification.setSender(new EmailSender());
        notification.notifyUser(user, message);
    }

    @Test
    void testSingletonService() {
        NotificationService s1 = NotificationService.getInstance();
        NotificationService s2 = NotificationService.getInstance();
        assertSame(s1, s2);
    }
}

