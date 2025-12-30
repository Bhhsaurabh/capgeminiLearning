package Classes;

public class Box {
	double len ;
	double bre;
	
	Box(double len , double bre){
		this.len = len;
		this.bre = bre;
	}
	public double getArea() {
		
		return len * bre;
		
	}
}
