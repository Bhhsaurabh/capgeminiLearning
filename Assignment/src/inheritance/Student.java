package inheritance;

public class Student extends Person {
    private int rollNo;
    private int marks;

    Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display() {
        System.out.println(name + " " + age + " " + rollNo + " " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student("Saurabh", 21, 101, 85);
        s.display();
    }
}