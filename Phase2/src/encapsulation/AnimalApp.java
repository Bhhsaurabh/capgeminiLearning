package encapsulation;

public class AnimalApp {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.inCall();
		
		Animal b = a;
		b.inCall();
	}
}
