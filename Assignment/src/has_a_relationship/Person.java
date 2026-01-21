package has_a_relationship;

public class Person {
    private String name;
    private Passport passport;

    Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public void showPerson() {
        System.out.println("Name: " + name);
        passport.showPassport();
    }

    public static void main(String[] args) {
        Passport p = new Passport("IND123456", "Indian");
        Person person = new Person("Saurabh", p);
        person.showPerson();
    }
}