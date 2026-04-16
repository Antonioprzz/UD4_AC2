package Despues;

public final class Manager extends Employee {
    public Manager(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double monthlyPay() {
        return baseSalary + 500;
    }
}
