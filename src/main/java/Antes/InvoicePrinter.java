package Antes;

import java.util.List;

public class InvoicePrinter {
    public String printInvoice(String customerName, List<Double> itemPrices, boolean premium) {
        double subtotal = 0;
        for (Double p : itemPrices) {
            if (p != null) subtotal += p;
        }

        double discount = 0;
        if (premium) {
            if (subtotal >= 200) discount = subtotal * 0.15;
            else if (subtotal >= 100) discount = subtotal * 0.10;
            else discount = subtotal * 0.05;
        }

        double taxed = (subtotal - discount) * 1.21;

        StringBuilder sb = new StringBuilder();
        sb.append("CUSTOMER: ").append(customerName).append("\n");
        sb.append("ITEMS: ").append(itemPrices.size()).append("\n");
        sb.append("SUBTOTAL: ").append(String.format("%.2f", subtotal)).append("\n");
        sb.append("DISCOUNT: ").append(String.format("%.2f", discount)).append("\n");
        sb.append("TOTAL(IVA 21%): ").append(String.format("%.2f", taxed)).append("\n");

        return sb.toString();
    }

}
