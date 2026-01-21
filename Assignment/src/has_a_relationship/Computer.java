package has_a_relationship;

public class Computer {
    private String model;
    private CPU cpu = new CPU("Intel", 3.2);

    Computer(String model) {
        this.model = model;
    }

    public void showComputer() {
        System.out.println("Model: " + model);
        cpu.showCPU();
    }

    public static void main(String[] args) {
        Computer c = new Computer("Dell Inspiron");
        c.showComputer();
    }
}