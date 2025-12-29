package InputAss;
import java.util.Scanner;
public class problem9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Side a : ");
		double a = sc.nextInt();
		System.out.println("Side b : ");
		double b = sc.nextInt();
		System.out.println("Side c : ");
		double c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println("Equilaterl Triangle");
		}
		else if(a == b || b == c || a == c) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scanlene Triangle");
		}
	}
}
