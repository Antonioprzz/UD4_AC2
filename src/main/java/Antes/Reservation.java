package Antes;

public class Reservation {
    private String startDate;
    private String endDate;

    public Reservation(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int days() {
        int startDay = Integer.parseInt(startDate.substring(8, 10));
        int endDay = Integer.parseInt(endDate.substring(8, 10));
        return endDay - startDay;
    }
}
