package Antes;

public class ShippingCost {

    public double calculate(double weightKg, double distanceKm) {
        double base = 4.99;
        if (weightKg > 20) base += 10;
        if (distanceKm > 500) base += 7.5;
        return base + distanceKm * 0.02;
    }
}
