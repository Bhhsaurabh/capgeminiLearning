package HierarchialInheritance;

public class Circle extends Shape{
	double pi = 3.14;
	double r;
	
	Circle(double r){
		this.r = r;
	}
	public double getArea() {
		area = pi * r * r;
		return area;
	}
	
}
