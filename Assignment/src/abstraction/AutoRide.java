package abstraction;

public class AutoRide extends Ride {

    AutoRide(int distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 15;
    }
}