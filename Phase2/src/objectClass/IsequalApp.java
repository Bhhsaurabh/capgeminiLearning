package objectClass;

public class IsequalApp {
	public static void main(String[] args) {
		Isequal e1 = new Isequal("hello" , 1);
		Isequal e2 = new Isequal("hello" , 1);
		
		System.out.println(e1.equals(e2));
		
	}
}
