package abstraction;

public abstract class Employee {

    protected String name;

    Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
    }
    
    public static void main(String[] args) {
    	Employee e = new PartTimeEmployee("Saurabh", 20, 500);
    	e.displayDetails();
    	System.out.println("Salary: " + e.calculateSalary());
	}
}