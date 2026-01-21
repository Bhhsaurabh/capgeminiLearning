package polymorphism;

class Employee {
    double calculateSalary() {
        return 0;
    }
}

class Developer extends Employee {
    @Override
    double calculateSalary() {
        return 60000;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 90000;
    }
}

class Intern extends Employee {
    @Override
    double calculateSalary() {
        return 20000;
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee e;

        e = new Developer();
        System.out.println("Developer Salary: " + e.calculateSalary());

        e = new Manager();
        System.out.println("Manager Salary: " + e.calculateSalary());

        e = new Intern();
        System.out.println("Intern Salary: " + e.calculateSalary());
    }
}