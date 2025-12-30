package Classes;

public class ConstructorChainingApp {
	public static void main(String[] args) {
		ConstructorChaining user1 = new ConstructorChaining();
		ConstructorChaining user2 = new ConstructorChaining("pan");
		ConstructorChaining user3 = new ConstructorChaining("pan" , "aadhar" , "voter");
		
		
		System.out.println(user1.pan);
		System.out.println(user2.pan);
		System.out.println(user3.pan);
		System.out.println(user3.aadhar);
		System.out.println(user3.voter);
		
	}
}
