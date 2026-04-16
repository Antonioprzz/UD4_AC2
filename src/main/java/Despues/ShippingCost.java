package Despues;

public class ShippingCost {

    private static final double BASE = 4.99;
    private static final int INT = 20;
    private static final int BASE1 = 10;
    private static final int INT1 = 500;
    private static final double BASE2 = 7.5;
    private static final double DOUBLE = 0.02;

    public double calculate(double weightKg, double distanceKm) {
        double base = BASE;
        if (weightKg > INT) base += BASE1;
        if (distanceKm > INT1) base += BASE2;
        return base + distanceKm * DOUBLE;
    }
}
