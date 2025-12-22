package InputAss;
import java.util.Scanner;
public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your char: ");
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase letter");
		}
		else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase letter");
		}
		else if(ch >= '0' && ch <= '9') {
			System.out.println("digit");
		}
		else {
			System.out.println("Special Char");
		}
		sc.close();
	}
}
