package inheritance;

class PersonBase {
    String name;

    PersonBase(String name) {
        this.name = name;
    }
}

class Teacher extends PersonBase {
    String subject;
    double salary;

    Teacher(String name, String subject, double salary) {
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + subject + " " + salary);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Neha", "Math", 50000);
        t.display();
    }
}