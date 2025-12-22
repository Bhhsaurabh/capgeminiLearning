package InputStream;
import java.util.Scanner;
public class InputStream {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name : " );
		String name = sc.nextLine();
		System.out.println("Marks : ");
		double marks = sc.nextDouble();
		System.out.println("Roll : ");
		int roll = sc.nextInt();
		System.out.println("Grade : ");
		String grade = sc.next();
		System.out.println("Is Pass : ");
		boolean isPass = sc.nextBoolean();
		System.out.println("Student Details : 🤡");
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
		System.out.println("Roll : " + roll);
		System.out.println("Grade : " + grade);
		System.out.println("Is Pass : " + isPass);
		sc.close();
	}
}
