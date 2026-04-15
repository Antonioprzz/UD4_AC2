package Antes;

public class Employee {
    public static final int DEV = 1;
    public static final int QA = 2;
    public static final int MANAGER = 3;

    private int type;
    private double baseSalary;

    public Employee(int type, double baseSalary) {
        this.type = type;
        this.baseSalary = baseSalary;
    }

    public double monthlyPay() {
        switch (type) {
            case DEV: return baseSalary + 200;
            case QA: return baseSalary + 100;
            case MANAGER: return baseSalary + 500;
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}
