package encapsulation;

public class PrintRef {
	
	public static void main(String[] args) {
		Auth a1 = new Auth("golu" ,"hello1");
		Animal a2 = new Animal();
		
		printObj(a1);
		printObj(a2);
	}
	
	public static void printObj(Auth a) {
		System.out.println(a);
	}
	public static void printObj(Animal a) {
		System.out.println(a);
	}
}
