package Despues;

import java.util.List;

public class InvoicePrinter {
    public String printInvoice(String customerName, List<Double> itemPrices, boolean premium) {
        double subtotal = obtenerSubtotal(itemPrices);

        double discount = descuento(premium, subtotal);

        double taxed = tarifa(subtotal, discount);

        StringBuilder sb = factura(customerName, itemPrices, subtotal, discount, taxed);

        return sb.toString();
    }

    private static StringBuilder factura(String customerName, List<Double> itemPrices, double subtotal, double discount, double taxed) {
        StringBuilder sb = new StringBuilder();
        sb.append("CUSTOMER: ").append(customerName).append("\n");
        sb.append("ITEMS: ").append(itemPrices.size()).append("\n");
        sb.append("SUBTOTAL: ").append(String.format("%.2f", subtotal)).append("\n");
        sb.append("DISCOUNT: ").append(String.format("%.2f", discount)).append("\n");
        sb.append("TOTAL(IVA 21%): ").append(String.format("%.2f", taxed)).append("\n");
        return sb;
    }

    private static double tarifa(double subtotal, double discount) {
        double taxed = (subtotal - discount) * 1.21;
        return taxed;
    }

    private static double descuento(boolean premium, double subtotal) {
        double discount = 0;
        if (premium) {
            if (subtotal >= 200) discount = subtotal * 0.15;
            else if (subtotal >= 100) discount = subtotal * 0.10;
            else discount = subtotal * 0.05;
        }
        return discount;
    }

    private static double obtenerSubtotal(List<Double> itemPrices) {
        double subtotal = 0;
        for (Double p : itemPrices) {
            if (p != null) subtotal += p;
        }
        return subtotal;
    }

}
