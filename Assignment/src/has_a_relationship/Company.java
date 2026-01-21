package has_a_relationship;

public class Company {
    private String companyName;
    private Employee emp;

    Company(String companyName, Employee emp) {
        this.companyName = companyName;
        this.emp = emp;
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        emp.showEmployee();
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Rahul", 50000);
        Company c = new Company("Infosys", e);
        c.showCompanyDetails();
    }
}