package Methods;

public class NoArgumentMethod {
	public static void AreaSquare() {
		double a = 24;
		System.out.println("Area of Square with " + "S = 24 :  " + a * a);
	}
	public static void AreaRec() {
		double a = 24;
		double b = 20;
		System.out.println("Area of Rectangle l = 24 , b = 20 :  " + a * b);
	}
	public static void AreaTriangle() {
		double a = 24;
		double b = 20;
		System.out.println("Area of Triangle b = 24 , h = 40 :  " +0.5*( a * b));
	}
	public static void AreaCircle() {
		double pi = 3.14;
		int r = 24;
		System.out.println("Area of circle with " + "r = 24 :  " + pi * r * r);
	}
	public static void main(String[] args) {
		AreaCircle();
		AreaSquare();
		AreaRec();
		AreaTriangle();
	}
}
