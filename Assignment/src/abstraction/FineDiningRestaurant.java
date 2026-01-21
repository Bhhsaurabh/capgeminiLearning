package abstraction;

public class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(String name) {
        super(name);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing gourmet food with care...");
    }
}