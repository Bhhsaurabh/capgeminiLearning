package has_a_relationship;

public class CPU {
    private String brand;
    private double speed;

    CPU(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void showCPU() {
        System.out.println("CPU Brand: " + brand);
        System.out.println("Speed: " + speed + " GHz");
    }
}