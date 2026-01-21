package abstraction;

public class BikeRide extends Ride {

    BikeRide(int distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 10;
    }
}