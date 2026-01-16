package Encapsulation;

public class AtmApp {
	public static void main(String[] args) {
		Atm a= new Atm(292);
		a.getPin();
		a.setPin(292, 3230);
		a.getPin();
	}
}
