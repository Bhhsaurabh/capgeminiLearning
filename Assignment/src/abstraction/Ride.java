package abstraction;

public abstract class Ride {

    protected int distance;

    Ride(int distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();

    public void rideDetails() {
        System.out.println("Distance: " + distance + " km");
    }
    
    public static void main(String[] args) {
    	Ride r = new CarRide(10);
    	r.rideDetails();
    	System.out.println("Fare: " + r.calculateFare());
	}
}