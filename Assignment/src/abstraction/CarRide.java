package abstraction;

public class CarRide extends Ride {

    CarRide(int distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 25;
    }
}