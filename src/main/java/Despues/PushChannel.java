package Despues;

public class PushChannel implements NotificationChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending push " + to + ": " + message);
    }
}
