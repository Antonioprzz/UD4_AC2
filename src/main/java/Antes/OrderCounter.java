package Antes;

import java.util.List;

public class OrderCounter {

    public int countExpensive(List<Double> prices) {
        int count = 0;
        double price = 0;
        boolean isExpensive = false;
        for (Double p : prices) {
            price = p;
            isExpensive = price > 100;
            if (isExpensive) {
                count++;
            }
        }
        return count;
    }
}
