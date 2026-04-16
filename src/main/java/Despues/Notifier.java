package Despues;

import java.util.Map;

public class Notifier {

    private final Map<String, NotificationChannel> channels = Map.of(
            "EMAIL", new EmailChannel(),
            "SMS", new SmsChannel(),
            "PUSH", new PushChannel()
    );

    public void notify(String channel, String to, String message) {
        NotificationChannel selected = channels.get(channel);
        if (selected == null) {
            throw new IllegalArgumentException("Unknown channel");
        }
        selected.send(to, message);
    }
}
