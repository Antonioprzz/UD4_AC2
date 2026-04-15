package Antes;

public class PriceCalculator {

    public double finalPrice(double base, boolean premiumCustomer) {
        double total = base + taxes(base);
        return applyDiscount(total, premiumCustomer);
    }

    private double taxes(double amount) {
        return amount * 0.21;
    }

    private double applyDiscount(double total, boolean premiumCustomer) {
        return discount(total, premiumCustomer);
    }

    private double discount(double total, boolean premiumCustomer) {
        if (premiumCustomer) return total * 0.9;
        return total;
    }
}
