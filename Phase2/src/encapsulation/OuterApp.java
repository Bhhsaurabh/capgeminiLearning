package encapsulation;

public class OuterApp {
	public static void main(String[] args) {
		Outer.Inner.display();
		Outer.Inner e1 = new Outer.Inner();
		e1.test();
		
		Outer ot = new Outer();
		Outer.Inner1  in = ot.new Inner1();
		in.test();
	}
}
