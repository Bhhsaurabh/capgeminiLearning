package abstraction;

public abstract class Restaurant {

    protected String name;

    Restaurant(String name) {
        this.name = name;
    }

    public abstract void prepareFood();

    public void orderReceived() {
        System.out.println("Order received at " + name);
    }
    public static void main(String[] args) {
    	Restaurant r = new FineDiningRestaurant("Royal Palace");
    	r.orderReceived();
    	r.prepareFood();
	}
}