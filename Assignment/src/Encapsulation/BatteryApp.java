package Encapsulation;

public class BatteryApp {
	public static void main(String[] args) {
		Battery b = new Battery(10);
		b.charge();
		b.useBattery();
	}
}
