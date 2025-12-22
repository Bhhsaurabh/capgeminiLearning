package InputAss;
import java.util.Scanner;
public class problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Char: ");
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||
				ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
		sc.close();
	}
}
