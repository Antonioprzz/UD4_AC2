package Despues;

public class Ticket {
    private final TicketStatus status;

    public Ticket(TicketStatus status) {
        this.status = status;
    }

    public boolean isClosed() {
    return status == (TicketStatus.CLOSED) || status.equals(TicketStatus.DONE);
    }
}
