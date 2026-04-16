package Despues;

public class SmsChannel implements NotificationChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS " + to + ": " + message);
    }
}
