package Classes;

public class VerificationApp {
	public static void main(String[] args) {
		Verification user1 = new Verification();
		Verification user2 = new Verification("pan");
		Verification user3 = new Verification("pan" , "aadhar" , "voter");
		
		
		System.out.println(user1.pan);
		System.out.println(user2.pan);
		System.out.println(user3.pan);
		System.out.println(user3.aadhar);
		System.out.println(user3.voter);
		
		
		
	}
}
