package has_a_relationship;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void showTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}