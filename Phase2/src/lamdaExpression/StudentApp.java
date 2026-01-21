package lamdaExpression;

public class StudentApp {
	public static void main(String[] args) {
		Student a = new Student("Saurabh",1) {
			public void display() {
				System.out.println("Dog");
			}
		};
		a.display();
	}
}
