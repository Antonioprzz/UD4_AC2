package Despues;

public class PriceCalculator {

    public double finalPrice(double base, boolean premiumCustomer) {
        double total = base + taxes(base);
        if (premiumCustomer) return total * 0.9;
        return total;
    }

    private double taxes(double amount) {
        return amount * 0.21;
    }

}
