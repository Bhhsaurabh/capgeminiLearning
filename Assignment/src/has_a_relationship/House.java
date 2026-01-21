package has_a_relationship;

public class House {
    private String owner;
    Room[] rooms = new Room[3];
    int i = 0;

    House(String owner) {
        this.owner = owner;
    }

    public void addRoom(Room r) {
        rooms[i++] = r;
    }

    public void showHouse() {
        System.out.println("Owner: " + owner);
        for (Room r : rooms) {
            if (r == null) continue;
            r.showRoom();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        House h = new House("Saurabh");

        h.addRoom(new Room("Bedroom", 120));
        h.addRoom(new Room("Kitchen", 80));

        h.showHouse();
    }
}