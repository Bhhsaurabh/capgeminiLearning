package Inheritance;

public class IsAstatic2 extends IsAstatic{
	int b = 20;
	
	public void num() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// you can not acces non staic to static fun so make object and access num();
		IsAstatic2 a2 = new IsAstatic2();
		
		a2.num();
		display();
	}
}
