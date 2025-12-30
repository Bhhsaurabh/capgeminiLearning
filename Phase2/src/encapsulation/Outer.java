package encapsulation;

public class Outer {
	 static class Inner{
			static void display() {
				System.out.println("Static method");
			}
			void test() {
				System.out.println("Non-static method");
			}
	 }
}

