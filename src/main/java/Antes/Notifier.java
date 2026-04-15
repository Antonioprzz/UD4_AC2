package Antes;

public class Notifier {
    public void notify(String channel, String to, String message) {
        if ("EMAIL".equals(channel)) {
            System.out.println("Sending EMAIL to " + to + ": " + message);
        } else if ("SMS".equals(channel)) {
            System.out.println("Sending SMS to " + to + ": " + message);
        } else if ("PUSH".equals(channel)) {
            System.out.println("Sending PUSH to " + to + ": " + message);
        } else {
            throw new IllegalArgumentException("Unknown channel");
        }
    }
}
