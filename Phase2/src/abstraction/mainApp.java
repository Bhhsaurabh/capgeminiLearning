package abstraction;

public class mainApp {
	public static void main(String[] args) {
		 Animal a = new Cat(); //Upcasting for generalization
		 Animal b = new Dog();
		 a.sound();
		 b.sound();
	}
}
