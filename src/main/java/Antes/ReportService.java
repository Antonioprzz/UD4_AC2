package Antes;

public class ReportService {

    public String buildSummary(int items, double pricePerItem, double shipping) {
        double value = items * pricePerItem;
        value = value + value * 0.21;
        value = value + shipping;

        return "TOTAL=" + value;
    }
}
