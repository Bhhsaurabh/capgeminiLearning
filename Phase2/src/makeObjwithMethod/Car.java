package makeObjwithMethod;

public class Car {
	int speed;
	Car(){
		
	}
	Car(int speed){
		this.speed = speed;
	}
	public static Car creatCar() {
		return new Car();
	}
	public static Car creatCar(int speed) {
		return new Car(speed);
	}
}
