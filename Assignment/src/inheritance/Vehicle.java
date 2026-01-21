package inheritance;

public class Vehicle {
    protected int speed;
    protected String fuelType;

    Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }
}

class Car extends Vehicle {
    private String brand;

    Car(int speed, String fuelType, String brand) {
        super(speed, fuelType);
        this.brand = brand;
    }

    public void show() {
        System.out.println(speed + " " + fuelType + " " + brand);
    }

    public static void main(String[] args) {
        Car c = new Car(120, "Petrol", "BMW");
        c.show();
    }
}