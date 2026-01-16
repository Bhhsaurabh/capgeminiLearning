package Encapsulation;

public class Speed {
	private int speed;
	
	Speed(int speed){
		
		this.speed = speed;
	}
	public void increaseSpeed() {
		if(speed <= 300) {
			speed++;
			System.out.println("Speed Reached! " + speed);
		}else {
			System.out.println("Max Speed Reached! " + speed);
		}
	}
	public void decreaseSpeed() {
		if(speed >= 1) {
			speed--;
			System.out.println("Speed Reached! " + speed);
		}else {
			System.out.println("Minimum Speed Reached! " + speed);
		}
	}
	
	public static void main(String[] args) {
		Speed s1 = new Speed(1);
		//s1.increaseSpeed();
		//s1.increaseSpeed();
		s1.decreaseSpeed();
		s1.decreaseSpeed();
	}
}
