package lamdaExpression;

public class Lamda {
	public static void main(String[] args) {
		Lam a = () -> {
			System.out.println("Hello");
			System.out.println("How");
		};
		a.animal();
		
		Dog d = (vol) ->{
			System.out.println(vol);
		};
		d.bark(20);
		
		
	}
}
