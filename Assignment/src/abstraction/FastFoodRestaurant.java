package abstraction;

public class FastFoodRestaurant extends Restaurant {

    FastFoodRestaurant(String name) {
        super(name);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing fast food quickly...");
    }
}