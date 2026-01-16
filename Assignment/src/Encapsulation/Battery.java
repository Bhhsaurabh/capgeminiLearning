package Encapsulation;

public class Battery {
	private int batteryLevel;
	
	Battery(int batteryLevel){
		this.batteryLevel = batteryLevel;
	}
	public void charge() {
		if(batteryLevel < 0){
			System.out.println("Battery is Dead!");
		}
		else if(batteryLevel <= 99) {
			System.out.println("Charing started!");
		}else  {
			System.out.println("Battey is Full!");
		}
	}
	public void useBattery() {
		if(batteryLevel >= 1 && batteryLevel <= 100) {
			System.out.println("Phone is ready you can Use it");
		}
		else if(batteryLevel <= 0) {
			System.out.println("sorry battery is Low!");
		}else {
			System.out.println("Battey is Exploded");
		}
	}
	
	
}
