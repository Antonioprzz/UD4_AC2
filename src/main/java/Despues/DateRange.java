package Despues;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateRange {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("El dia no puede empezar antes de acabar");
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public int days(){
        return (int) ChronoUnit.DAYS.between(startDate, endDate);
        }
    }

