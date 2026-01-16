package relationship;

public class Car {
	private String modelName;
	
	public String getModel() {
		return modelName;
	}
	public void setMode(String modelName) {
		this.modelName = modelName;
	}
	Car(){
		
	}
	Car(String modelName){
		this.modelName = modelName;
	}
	
	// Achive has-a relationship
	
	private Engine e = new Engine(1000);
	
	public Engine getEngine() {
		return e;
	}
	
	//Tyre
	
	private Tyre[] t = {new Tyre("Mrf") ,
			new Tyre("Crf"),
			new Tyre("Drf"),
			new Tyre("Hrf") 
	};
	
	public Tyre[] getTyre() {
		return t;
	}
	
	public void setTyre(Tyre[] t) {
		this.t = t;
	}
	
}
