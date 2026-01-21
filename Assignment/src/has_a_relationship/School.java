package has_a_relationship;

public class School {
    private String schoolName;
    Teacher[] teachers = new Teacher[3];
    int i = 0;

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addTeacher(Teacher t) {
        teachers[i++] = t;
    }

    public void showTeachers() {
        System.out.println("School: " + schoolName);
        for (Teacher t : teachers) {
            if (t == null) continue;
            t.showTeacher();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        School s = new School("DPS");

        s.addTeacher(new Teacher("Amit", "Math"));
        s.addTeacher(new Teacher("Neha", "Science"));

        s.showTeachers();
    }
}