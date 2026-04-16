package Despues;

import java.time.LocalDate;

public class Reservation {
    private final DateRange range;

    public Reservation(String startDate, String endDate) {
        // Convierte los Strings a LocalDate y crea el DateRange aquí dentro
        this.range = new DateRange(LocalDate.parse(startDate), LocalDate.parse(endDate));
    }

    public int days() {
        return range.days(); // delega, no calcula nada
    }
}
