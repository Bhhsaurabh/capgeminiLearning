package has_a_relationship;

public class Mobile {
    private String brand;
    private SIM sim = new SIM("Jio", "9876543210");

    Mobile(String brand) {
        this.brand = brand;
    }

    public void makeCall() {
        System.out.println("Mobile Brand: " + brand);
        sim.showSimDetails();
        System.out.println("Calling...");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung");
        m.makeCall();
    }
}