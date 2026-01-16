package HierarchialInheritance;

public class Square extends Shape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	public double getArea() {
		area = side*side;
		return area;
	}
	
}
