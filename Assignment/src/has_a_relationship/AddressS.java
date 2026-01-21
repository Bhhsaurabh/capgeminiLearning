package has_a_relationship;

public class AddressS {
    private String city;
    private String state;
    private int pincode;

    AddressS(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public void showAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Pincode: " + pincode);
    }
}