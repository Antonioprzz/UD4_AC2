package Despues;

import java.util.List;

public class OrderCounter {

    public int countExpensive(List<Double> prices) {
        int count = 0;
        for (Double p : prices) {
            if (p != null && p > 100) {
                count++;
            }
        }
        return count;
    }
}

