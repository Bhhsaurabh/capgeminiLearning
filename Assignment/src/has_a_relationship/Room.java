package has_a_relationship;

public class Room {
    private String roomType;
    private double area;

    Room(String roomType, double area) {
        this.roomType = roomType;
        this.area = area;
    }

    public void showRoom() {
        System.out.println("Room: " + roomType);
        System.out.println("Area: " + area);
    }
}