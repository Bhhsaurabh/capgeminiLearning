package Variables;

public class FinalVar {
	public static void pri(int a) {
		System.out.print(a);
	}
	public static void main(String[] args ) {
		final int a = 20;
		pri(a);
		a = 19; // you can not change the value of a final int
		pri(a);
		
	}
}
