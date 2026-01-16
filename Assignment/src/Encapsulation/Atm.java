package Encapsulation;

public class Atm {
	private int pin;
	Atm(){
		
	}
	Atm(int pin ){
		this.pin = pin;
	}
	
	public void setPin(int pin , int newPin) {
		if(this.pin == pin) {
			this.pin = newPin;
		}else {
			System.out.println("Enter Valid pin first!");
		}
	}
	public void getPin() {
		System.out.println("Your pin is : " + pin);
	}
}
