package InputStream;
import java.util.Scanner;
public class CharInp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Char: ");
		char a = sc.next().charAt(0);
		if(a == 'a' || a =='A') {
			System.out.println(a + " for Apple");
		}
		else if(a == 'b' || a =='B') {
			System.out.println(a + " for Ball");
		}
		else if(a == 'c' || a =='C') {
			System.out.println(a + " for Cat");
		}
		else if(a == 'd' || a =='D') {
			System.out.println(a + " for Dog");
		}
		else if(a == 'e' || a =='E') {
			System.out.println(a + " for Elephant");
		}
		else if(a == 'f' || a =='F') {
			System.out.println(a + " for Fan");
		}
		else {
			System.out.println("🤡");
		}
		
	}

}
