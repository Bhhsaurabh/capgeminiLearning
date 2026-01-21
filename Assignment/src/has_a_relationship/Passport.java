package has_a_relationship;

public class Passport {
    private String passportNumber;
    private String nationality;

    Passport(String passportNumber, String nationality) {
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public void showPassport() {
        System.out.println("Passport No: " + passportNumber);
        System.out.println("Nationality: " + nationality);
    }
}