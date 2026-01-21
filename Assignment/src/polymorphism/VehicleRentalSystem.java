package polymorphism;

class Vehicle {
    double calculateRent(int days) {
        return 0;
    }
}

class Car extends Vehicle {
    double calculateRent(int days) {
        return days * 1000;
    }
}

class Bike extends Vehicle {
    double calculateRent(int days) {
        return days * 500;
    }
}

class Truck extends Vehicle {
    double calculateRent(int days) {
        return days * 2000;
    }
}

class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        System.out.println("Car Rent: " + v.calculateRent(3));

        v = new Bike();
        System.out.println("Bike Rent: " + v.calculateRent(3));

        v = new Truck();
        System.out.println("Truck Rent: " + v.calculateRent(3));
    }
}