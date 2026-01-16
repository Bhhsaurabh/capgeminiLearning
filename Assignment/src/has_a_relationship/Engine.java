package has_a_relationship;

public class Engine {
	private String engineType;
	private int horsePower;
	
	Engine(){
		
	}
	Engine(String engineType , int horsePower){
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	
	public void getEngineTY() {
		System.out.println("EngineType: " + engineType);
	}
	public void getHorsePower() {
		System.out.println("HorsePower: " + horsePower);
	}
	public void setEngineTy(String engineType) {
		this.engineType = engineType;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
}
