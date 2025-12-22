package Loops;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'n';
		do {
			System.out.println("Welcome!");
			System.out.println("do you want me to print again type: y(yes) or n(no)");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		sc.close();
	
	}
}
