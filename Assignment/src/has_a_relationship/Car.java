package has_a_relationship;

public class Car {
	private String brand;
	
	Car(){
		
	}
	Car(String brand){
		this.brand = brand;
	}
	private Engine e= new Engine("V8" , 5000);
	
	public Engine getEngine() {
		return e;
	}
	public void setEngine(Engine e) {
		this.e = e;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		Car c = new Car("BMW");
		System.out.println("Brand: " + c.getBrand());
		System.out.print("Engine: ") ; c.getEngine().getEngineTY();
		System.out.print("Horse Power: "); c.getEngine().getHorsePower();
		
		System.out.println();
		
		c.setEngine(new Engine("V9",6000));
		c.setBrand("Lambo");
		System.out.println("Brand: " + c.getBrand());
		System.out.print("Engine: ") ; c.getEngine().getEngineTY();
		System.out.print("Horse Power: "); c.getEngine().getHorsePower();
		
	}
	
}
