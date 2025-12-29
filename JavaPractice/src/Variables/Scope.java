package Variables;

public class Scope {
	public static void main(String[] args) {
		{
			int a = 20; // local var scope
			System.out.println(a);
		}
		int a = 10;
		System.out.println(a);
		
		
	}
}
