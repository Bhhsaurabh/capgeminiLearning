package has_a_relationship;

public class SIM {
    private String network;
    private String number;

    SIM(String network, String number) {
        this.network = network;
        this.number = number;
    }

    public void showSimDetails() {
        System.out.println("Network: " + network);
        System.out.println("Number: " + number);
    }
}