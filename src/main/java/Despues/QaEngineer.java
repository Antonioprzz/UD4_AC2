package Despues;

public final class QaEngineer extends Employee {
    public QaEngineer(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double monthlyPay() {
        return baseSalary + 100;
    }
}
