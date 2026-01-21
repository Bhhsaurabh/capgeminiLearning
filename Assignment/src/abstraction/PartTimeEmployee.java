package abstraction;

public class PartTimeEmployee extends Employee {

    private int hours;
    private double ratePerHour;

    PartTimeEmployee(String name, int hours, double ratePerHour) {
        super(name);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hours * ratePerHour;
    }
}