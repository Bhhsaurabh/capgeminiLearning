package HierarchialInheritance;

public class TestHierarchialInheritance {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.12);
		System.out.println("Circle: " + c1.getArea());
		Square sq = new Square(2.12);
		System.out.println("Square: " +  sq.getArea());
		Triangle tr = new Triangle(2.12 , 4.2);
		System.out.println("Triangle: " + tr.getArea());
	}
}
	