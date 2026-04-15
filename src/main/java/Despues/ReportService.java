package Despues;

public class ReportService {

    public String buildSummary(int items, double pricePerItem, double shipping) {
        final double subtotal = items * pricePerItem;
        final double tax= subtotal * 0.21;
        final double finalTax = subtotal + tax;
        final double total = finalTax + shipping;
        
        return "TOTAL="  + total;
    }
}
