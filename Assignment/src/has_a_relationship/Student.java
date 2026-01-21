package has_a_relationship;

public class Student {
    private String name;
    private AddressS address;

    Student(String name, AddressS address) {
        this.name = name;
        this.address = address;
    }

    public void showStudentDetails() {
        System.out.println("Student Name: " + name);
        address.showAddress();
    }

    public static void main(String[] args) {
        AddressS a = new AddressS("Delhi", "Delhi", 110001);
        Student s = new Student("Saurabh", a);
        s.showStudentDetails();
    }
}