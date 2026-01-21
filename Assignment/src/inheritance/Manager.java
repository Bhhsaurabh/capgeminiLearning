package inheritance;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println(name + " " + salary + " " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Amit", 80000, "IT");
        m.display();
    }
}