package encapsulation;

public class Animal {
	private class Inner{
		public void Dispay() {
			System.out.println("Hello sir");
		}
	}
	public void inCall() {
		Inner i = new Inner();
		i.Dispay();
	}
}
