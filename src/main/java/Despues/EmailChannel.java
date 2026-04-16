package Despues;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending email " + to + ": " + message);
    }
}
