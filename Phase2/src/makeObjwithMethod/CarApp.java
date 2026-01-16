package makeObjwithMethod;

public class CarApp {
	public static void main(String[] args) {
		Car c = Car.creatCar();
		System.out.println(c);
		Car c2 = Car.creatCar(20);
		System.out.println(c2.speed);
	}
}
