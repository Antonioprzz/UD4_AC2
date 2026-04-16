package Despues;

public final class Developer extends Employee {
    public Developer(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double monthlyPay() {
        return baseSalary + 200;
    }
}
