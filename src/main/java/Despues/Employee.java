package Despues;

public abstract class Employee {
    protected final double baseSalary;

    protected Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double monthlyPay();

    public static Employee create(EmployeeType type, double baseSalary) {
        return switch (type) {
            case DEV -> new Developer(baseSalary);
            case QA -> new QaEngineer(baseSalary);
            case MANAGER -> new Manager(baseSalary);
        };
    }
}
