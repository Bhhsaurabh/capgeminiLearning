package encapsulation;

public class AuthApp {
	public static void main(String[] args) {
		Auth user = new Auth("Saurabh" , "Hello@123");
		user.setUsername("Hell@123", "Ram");
		System.out.println(user.getUsername());
	}
}
