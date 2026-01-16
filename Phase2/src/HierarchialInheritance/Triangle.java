package HierarchialInheritance;

public class Triangle extends Shape{
	double b;
	double h;
	
	Triangle(double b , double h){
		this.b = b;
		this.h = h;
	}
	public double getArea() {
		area = 0.5 * b * h;
		return area;
	}
}
