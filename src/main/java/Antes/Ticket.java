package Antes;

public class Ticket {
    private String status;

    public Ticket(String status) {
        this.status = status;
    }

    public boolean isClosed() {
        return "CLOSED".equals(status) || "DONE".equals(status);
    }
}
